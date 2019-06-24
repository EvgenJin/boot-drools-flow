package com.javainuse.model;

/**
 * This is a sample class to launch a rule.
 */
public class Message {

	public static final int HELLO = 0;
	public static final int GOODBYE = 1;

	private String message;
	private int status;
	private Integer cat_id;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Integer getCat_id() {
		return this.cat_id;
	}
	public void setCat_id(Integer cat_id) {
		this.cat_id = cat_id;
	}

}
