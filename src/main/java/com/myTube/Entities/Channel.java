package com.myTube.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_Channel")
public class Channel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Channel_ID")
	private int channelId;
	
	@Column(name="Channel_Name")
	private String channelname;
	
	@Column(name="Channel_Followers")
	private String channelfollowers;
	
	@OneToOne
	@JoinColumn(name="ChannelUser")
	private User user;

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

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
	
	public Channel()
	{
		
	}

	public Channel(String channelname, String channelfollowers, User user) {
		super();
		this.channelname = channelname;
		this.channelfollowers = channelfollowers;
		this.user = user;
	}

	
	
	public Channel(int channelId, String channelname, String channelfollowers, User user) {
		super();
		this.channelId = channelId;
		this.channelname = channelname;
		this.channelfollowers = channelfollowers;
		this.user = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + channelId;
		result = prime * result + ((channelfollowers == null) ? 0 : channelfollowers.hashCode());
		result = prime * result + ((channelname == null) ? 0 : channelname.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Channel other = (Channel) obj;
		if (channelId != other.channelId)
			return false;
		if (channelfollowers == null) {
			if (other.channelfollowers != null)
				return false;
		} else if (!channelfollowers.equals(other.channelfollowers))
			return false;
		if (channelname == null) {
			if (other.channelname != null)
				return false;
		} else if (!channelname.equals(other.channelname))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	
	
	
	
}
