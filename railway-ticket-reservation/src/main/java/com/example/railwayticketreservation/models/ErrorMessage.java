package com.example.railwayticketreservation.models;

public class ErrorMessage {
	private int status;
	private String message;
	
	public ErrorMessage(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ErrorClazz [status=" + status + ", message=" + message + "]";
	}

}