package com.myTube.web.dto;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

import com.myTube.Entities.Channel;

public class VideoDTO {

	@NotEmpty
	private String videoname;
	
	@NotEmpty
	private float videolength;
	
	@NotEmpty
	private int videolikes;
	
	@NotEmpty
	private int videodislikes;
	
	private String videodescription;
	
	@NotEmpty
	private String videoURL;
	
	@NotEmpty
	private Channel channel;

	public String getVideoname() {
		return videoname;
	}

	public void setVideoname(String videoname) {
		this.videoname = videoname;
	}

	public float getVideolength() {
		return videolength;
	}

	public void setVideolength(float videolength) {
		this.videolength = videolength;
	}

	public int getVideolikes() {
		return videolikes;
	}

	public void setVideolikes(int videolikes) {
		this.videolikes = videolikes;
	}

	public int getVideodislikes() {
		return videodislikes;
	}

	public void setVideodislikes(int videodislikes) {
		this.videodislikes = videodislikes;
	}

	public String getVideodescription() {
		return videodescription;
	}

	public void setVideodescription(String videodescription) {
		this.videodescription = videodescription;
	}

	public String getVideoURL() {
		return videoURL;
	}

	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	
	
	
	
}
