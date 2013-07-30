package org.dveledo.primefacesMaven.exceptions;

import org.dveledo.primefacesMaven.constants.ErrorConstants;

public class InvalidCredentialsException extends Exception {

	private static final long serialVersionUID = 3806441597635597115L;

	@Override
	public String getMessage() {		
		return ErrorConstants.INVALID_CREDENTIALS;
	}

}
