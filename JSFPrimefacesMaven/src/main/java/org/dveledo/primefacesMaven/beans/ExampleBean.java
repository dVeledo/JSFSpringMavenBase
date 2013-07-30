package org.dveledo.primefacesMaven.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ExampleBean implements Serializable {

	private int number;
	
	public ExampleBean() { /* ... */ }

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}	
}
