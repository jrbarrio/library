package com.roldan.library.interfaces.rest;

public class Greeting {

	private String text;
	private String name;
	
	public Greeting(String text, String name) {
		this.text = text;
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
