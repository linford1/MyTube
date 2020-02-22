package com.myTube.Services;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface AmazonS3WebService {

	public File convertMultiPartToFile(MultipartFile file) throws IOException;
	
	public String generateFileName(MultipartFile multiPart);
	
	public void uploadFileTos3bucket(String fileName, File file) throws IOException;
	
	public String uploadFile(MultipartFile multipartFile, String FolderName) throws IOException; 
}
