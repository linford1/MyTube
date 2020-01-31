package com.myTube.Services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.fileupload.MultipartStream;
import org.springframework.web.multipart.MultipartFile;

import com.myTube.Entities.Video;
import com.myTube.web.dto.VideoDTO;

public class VideoServiceImplimentation {
	
	private String videoStoragePath = "D:\\Eclipse Projects\\testFiles\\MytubeVersioned\\MyTube\\VideoStorage\\";

	public Video CreateVideo(VideoDTO video)
	{
		Video newVideo = new Video();
		
		newVideo.setChannel(video.getChannel());
		newVideo.setVideodescription(video.getVideodescription());
		newVideo.setVideodislikes(video.getVideodislikes());
		newVideo.setVideolength(video.getVideolength());
		newVideo.setVideolikes(video.getVideolikes());
		newVideo.setVideoURL(videoStoragePath+video.getVideofile().getName());
		newVideo.setVideoname(video.getVideoname());
		
		return newVideo;
	}
	
	public void UploadVideoFile(MultipartFile video, String videoName)
	{
		//MultipartStream inStream = null;
	//	OutputStream outStream = null;
		
		
		try
		{
		video.transferTo(new File(videoStoragePath+videoName));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		/*			try
		{
		inStream = new MultipartStream();
			outStream = new FileOutputStream(videoStoragePath+videoName);
			
			byte[] buffer = new byte[1024];
			
			int length;
			
			while((length = inStream.read(buffer)) > 0)
			{
				outStream.write(buffer,0,length);
			}
			
			inStream.close();
			outStream.close();
			
			video.delete();
			
			System.out.println("File Copied success");
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		*/
		
	}
}
