package com.sys.task.exception;

public class TableNotFoundException extends RuntimeException {
	
	public TableNotFoundException(String exceptionmsg) {
		super(exceptionmsg);
	}

}
