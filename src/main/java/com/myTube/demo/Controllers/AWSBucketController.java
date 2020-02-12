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


}
