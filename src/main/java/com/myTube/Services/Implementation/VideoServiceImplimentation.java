package com.myTube.Services.Implementation;

import java.io.File;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;
import com.myTube.Entities.Video;
import com.myTube.web.dto.VideoDTO;



public class VideoServiceImplimentation {

	public Video CreateVideo(VideoDTO video)
	{
		Video newVideo = new Video();
		
		newVideo.setChannel(video.getChannel());
		newVideo.setVideodescription(video.getVideodescription());
		newVideo.setVideodislikes(video.getVideodislikes());
		newVideo.setVideolength(video.getVideolength());
		newVideo.setVideolikes(video.getVideolikes());
		newVideo.setVideoURL(video.getVideoname());
		newVideo.setVideoname(video.getVideoname());
		
		return newVideo;
	}
	
	public void UploadVideoFile(MultipartFile video, String videoName)
	{
		try
		{
		video.transferTo(new File(videoName));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
