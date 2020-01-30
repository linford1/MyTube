package com.myTube.web.dto;


import javax.validation.constraints.NotEmpty;

import com.myTube.Entities.User;

public class ChannelCreationDTO {
	
	@NotEmpty
	private String channelname;
	
	@NotEmpty
	private String channelfollowers;
	
	@NotEmpty
	private User user;

	public String getChannelname() {
		return channelname;
	}

	public void setChannelname(String channelname) {
		this.channelname = channelname;
	}

	public String getChannelfollowers() {
		return channelfollowers;
	}

	public void setChannelfollowers(String channelfollowers) {
		this.channelfollowers = channelfollowers;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
