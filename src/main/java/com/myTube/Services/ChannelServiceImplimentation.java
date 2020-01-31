package com.myTube.Services;

import com.myTube.Entities.Channel;
import com.myTube.web.dto.ChannelCreationDTO;

public class ChannelServiceImplimentation {

	public Channel createChannel(ChannelCreationDTO channel)
	{
		Channel newChannel =  new Channel();
		newChannel.setChannelname(channel.getChannelname());
		newChannel.setUser(channel.getUser());
		
		
		return newChannel;
	}
}
