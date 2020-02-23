package com.myTube.Services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.myTube.Entities.Video;
import com.myTube.web.dto.VideoDTO;

public interface VideoService {

	public Video CreateVideo(VideoDTO video);
	
	public void UploadVideoFile(MultipartFile video, String videoName);
	
	public List<Video> listVideos();
}
