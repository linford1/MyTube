package com.myTube.Services;

import com.myTube.Entities.Channel;
import com.myTube.Entities.Video;
import com.myTube.web.dto.ChannelCreationDTO;

public interface ChannelService {

	public Channel createChannel(ChannelCreationDTO channel);
	
	
	public void AddVideoToChannel(Channel channel, Video video);
}
