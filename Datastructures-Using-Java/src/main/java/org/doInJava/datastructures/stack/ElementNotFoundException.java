package org.doInJava.datastructures.stack;

public class ElementNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 96200904183L;
	
	private String message;
	
	public ElementNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
