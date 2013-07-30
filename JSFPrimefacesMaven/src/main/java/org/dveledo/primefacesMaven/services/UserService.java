package org.dveledo.primefacesMaven.services;

import org.dveledo.primefacesMaven.exceptions.InvalidCredentialsException;
import org.dveledo.primefacesMaven.pojo.UserAccessInfo;

public interface UserService {

	public String getUserName();
	public UserAccessInfo doLogin(String userName, String password) throws InvalidCredentialsException;
	
}
