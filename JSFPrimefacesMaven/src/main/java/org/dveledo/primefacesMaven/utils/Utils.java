package org.dveledo.primefacesMaven.utils;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Utils {

	public static void addAttrToSession(String key, Object value) {
		getApplicationMap().put(key, value);
	}
	
	public static Map<String, Object> getApplicationMap() {
		return FacesContext.getCurrentInstance().getExternalContext().getApplicationMap();
	}
	
	public static void showError(String error) {
		showError(error, null);
	}
	
	public static void showError(String error, String componentID) {
		
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
														error, 
														error);
		FacesContext.getCurrentInstance().addMessage(componentID, facesMessage);
	}
	
	public static void showInfo(String info) {
		showInfo(info, null);
	}
	
	public static void showInfo(String info, String componentID) {
		
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, 
														info, 
														info);
		FacesContext.getCurrentInstance().addMessage(componentID, facesMessage);
	}
}
