package org.dveledo.primefacesMaven.beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.dveledo.primefacesMaven.constants.Constants;
import org.dveledo.primefacesMaven.exceptions.InvalidCredentialsException;
import org.dveledo.primefacesMaven.pojo.UserAccessInfo;
import org.dveledo.primefacesMaven.services.UserServiceImpl;
import org.dveledo.primefacesMaven.utils.Utils;
import org.springframework.context.annotation.Scope;

@Named
@Scope("session")
public class UserBean implements Serializable {

	private static final long serialVersionUID = 3045431918848041253L;
	
	// Services
	@Inject
	private UserServiceImpl userService;
	
	// Credenciales
	private String userName;
	private String password;
	
	//
	private boolean activeSession;

	public UserBean() { /* ... */ }
	
	@PostConstruct
	public void init() { /* ... */ }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActiveSession() {
		return activeSession;
	}

	public void setActiveSession(boolean activeSession) {
		this.activeSession = activeSession;
	}

	public void login() {
		try {
			UserAccessInfo userAccesInfo = userService.doLogin(userName, password);
			Utils.addAttrToSession(Constants.SESSION_KEY_ACCES_INFO_USER, userAccesInfo);
			activeSession = true;
			
		} catch (InvalidCredentialsException invCred) {
			Utils.showError(invCred.getMessage());
		}
	}
}
