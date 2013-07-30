package org.dveledo.primefacesMaven.exceptions;

import org.dveledo.primefacesMaven.constants.ErrorConstants;

public class UserNotLoggedException extends Exception {
	
	private static final long serialVersionUID = -4261408373736646525L;

	@Override
	public String getMessage() {		
		return ErrorConstants.USER_NOT_LOGGED;
	}
}
