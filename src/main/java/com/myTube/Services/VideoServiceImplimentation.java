package com.myTube.Services;

import com.myTube.Entities.Video;
import com.myTube.web.dto.VideoDTO;

public class VideoServiceImplimentation {

	public Video AddVideo(VideoDTO video)
	{
		Video newVideo = new Video();
		
		newVideo.setChannel(video.getChannel());
		newVideo.setVideodescription(video.getVideodescription());
		newVideo.setVideodislikes(video.getVideodislikes());
		newVideo.setVideolength(video.getVideolength());
		newVideo.setVideolikes(video.getVideolikes());
		newVideo.setVideoURL(video.getVideoURL());
		newVideo.setVideoname(video.getVideoname());
		
		return newVideo;
	}
}
