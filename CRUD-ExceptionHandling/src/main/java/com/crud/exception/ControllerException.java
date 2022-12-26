package com.crud.exception;

public class ControllerException extends RuntimeException{
	private static final Long serialVersionUID= 1L;
	private String errorCode;
	private String errorMsg;
	public ControllerException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ControllerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public ControllerException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public ControllerException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public ControllerException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public static Long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
