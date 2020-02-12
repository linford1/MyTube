package com.myTube.Services.Implementation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.myTube.Services.AmazonS3WebService;

@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "amazonproperties" )
@Service
public class AmazonClient implements AmazonS3WebService{

	private AmazonS3 s3client;

    @Value("${amazonproperties.endpointUrl}")
    private String endpointUrl;
    @Value("${amazonproperties.bucketName}")
    private String bucketName;
    @Value("${amazonproperties.accessKey}")
    private String accessKey;
    @Value("${amazonproperties.secretKey}")
    private String secretKey;
    	
	@PostConstruct
	    private void initializeAmazon() {
	       AWSCredentials credentials = new BasicAWSCredentials(this.accessKey, this.secretKey);
	       this.s3client = new AmazonS3Client(credentials);
	}
	
	public File convertMultiPartToFile(MultipartFile file) throws IOException {
	    File convFile = new File(file.getOriginalFilename());
	    FileOutputStream fos = new FileOutputStream(convFile);
	    fos.write(file.getBytes());
	    fos.close();
	    return convFile;
	}
	
	public String generateFileName(MultipartFile multiPart) {
	    return new Date().getTime() + "-" + multiPart.getOriginalFilename().replace(" ", "_");
	}
	
	public void uploadFileTos3bucket(String fileName, File file) {
	    s3client.putObject(new PutObjectRequest(bucketName, fileName, file)
	            .withCannedAcl(CannedAccessControlList.PublicRead));
	}
	
	public String uploadFile(MultipartFile multipartFile) {

	    String fileUrl = "";
	    try {
	        File file = convertMultiPartToFile(multipartFile);
	        String fileName = generateFileName(multipartFile);
	        fileUrl = endpointUrl + "/" + /* bucketName + "/" +*/ fileName;
	        uploadFileTos3bucket(fileName, file);
	        file.delete();
	    } catch (Exception e) {
	       e.printStackTrace();
	    }
	    return fileUrl;
	}
	
}
