package org.dveledo.primefacesMaven.pojo;

import java.io.Serializable;

public class UserAccessInfo implements Serializable {

	private static final long serialVersionUID = 6451793740017108564L;
	
	private boolean administrator;
	private String name;
	private String email;

	public UserAccessInfo() {
		super();
	}

	public UserAccessInfo(boolean administrator, String name, String email) {
		super();
		this.administrator = administrator;
		this.name = name;
		this.email = email;
	}

	public boolean isAdministrator() {
		return administrator;
	}

	public void setAdministrator(boolean administrator) {
		this.administrator = administrator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserAccessInfo [administrator=" + administrator + ", name="
				+ name + ", email=" + email + "]";
	}

}
