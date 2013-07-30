package org.dveledo.primefacesMaven.filters;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import org.dveledo.primefacesMaven.constants.Constants;
import org.dveledo.primefacesMaven.constants.ErrorConstants;
import org.dveledo.primefacesMaven.utils.Utils;

@ManagedBean
@RequestScoped
public class AuthValidator {

	public void validatePrivate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		
		if (Utils.getApplicationMap().get(Constants.SESSION_KEY_ACCES_INFO_USER) == null) {
			throw new ValidatorException(new FacesMessage(ErrorConstants.USER_NOT_LOGGED));
		}
	}
	
	
}
