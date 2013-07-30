package org.dveledo.primefacesMaven.services;

import java.util.Random;

import javax.inject.Named;

import org.dveledo.primefacesMaven.exceptions.InvalidCredentialsException;
import org.dveledo.primefacesMaven.pojo.UserAccessInfo;

@Named
public class UserServiceImpl implements UserService {

	@Override
	public String getUserName() {
		return "dVeledo";
	}

	@Override
	public UserAccessInfo doLogin(String userName, String password) throws InvalidCredentialsException {
		//TODO hacer login contra capa de datos
		Random r = new Random();
		if (r.nextBoolean()) {
			UserAccessInfo userAccesInfo = new UserAccessInfo(true, "Darío", "darvelgar@gmail.com");
			
			return userAccesInfo;
			
		} else {
			throw new InvalidCredentialsException();
		}
	}
	
}
