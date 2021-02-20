package com.deploy.deployment;

import java.io.Serializable;
import java.util.Date;

public class DeploymentModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String message;
	
	private Date timeStamp;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "DeploymentModel [message=" + message + ", timeStamp=" + timeStamp + "]";
	}
	



}
