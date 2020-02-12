package com.myTube.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.myTube.Services.Implementation.AmazonClient;

@RestController
@RequestMapping(value="/storage/")
public class AWSBucketController {

	
	private AmazonClient amazonClient;

    @Autowired
    AWSBucketController(AmazonClient amazonClient) {
        this.amazonClient = amazonClient;
    }

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestPart(value = "file") MultipartFile file) {
    	
    	return this.amazonClient.uploadFile(file);
    }
    
    
    @DeleteMapping("/deleteFile")
    public String deleteFile(@RequestPart(value = "url") String fileUrl) {
        return ""; //this.amazonClient.deleteFileFromS3Bucket(fileUrl);
    }

 /*   
  * @PostMapping("/uploadFile")
    public void uploadFile(@RequestPart(value = "file") MultipartFile file) {
    	
    	try 
    	{
    		File localFile = new File(file.getOriginalFilename());
    		FileOutputStream fos = new FileOutputStream(localFile);
    		fos.write(file.getBytes());
    		fos.close();
    		
    		PutObjectRequest putObjectRequest = new PutObjectRequest("mytubevideos-proj", "TestFile", localFile);
            this.amazonClient.putObject(putObjectRequest);
    	}
    	catch (IOException | AmazonServiceException ex) {
            //logger.error("error [" + ex.getMessage() + "] occurred while uploading "); // [" + fileName + "] ");
        }
    	
    }
    
  * @Async
    @DeleteMapping("/deleteFile")
    public void deleteFile(@RequestPart(value = "url") String fileUrl) {
    	
    	 try {
    		 this.amazonClient.deleteObject(new DeleteObjectRequest("mytubevideos-proj", fileUrl));
         } catch (AmazonServiceException ex) {
            // logger.error("error [" + ex.getMessage() + "] occurred while removing [" + fileName + "] ");
         }
    }
    */
}
