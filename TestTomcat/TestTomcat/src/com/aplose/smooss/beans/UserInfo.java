package com.aplose.smooss.beans;

import java.util.ArrayList;
import java.util.Collection;

public class UserInfo {
	
	private String name;
	private Collection<String> books=new ArrayList<String>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}