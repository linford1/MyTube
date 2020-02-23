package com.myTube.Services;

import com.myTube.Entities.User;
import com.myTube.web.dto.UserLogInDTO;
import com.myTube.web.dto.UserRegistrationDTO;

public interface UserService {

	public User createUserObject(UserRegistrationDTO registration);
	public User createUserObject(UserLogInDTO registration);
}
