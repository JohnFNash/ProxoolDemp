package com.johnfnash.study.model;

public class Result {
	private String error;
	private boolean success;
	private Object result;
	
	public Result() {
		super();
	}

	public Result(String error, boolean success, Object result) {
		super();
		this.error = error;
		this.success = success;
		this.result = result;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
	
	public static Result getSuccessResult(Object data) {
		return new Result("", true, data);
	}

	public static Result getFailResult(String error) {
		return new Result(error, false, null);
	}
	
}
