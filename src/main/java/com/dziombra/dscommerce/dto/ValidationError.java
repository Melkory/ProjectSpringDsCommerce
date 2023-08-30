package com.dziombra.dscommerce.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError {

	private List<FieldMessage> errors = new ArrayList<>();
	
	public ValidationError(Instant timeStamp, Integer status, String error, String path) {
		super(timeStamp, status, error, path);
		// TODO Auto-generated constructor stub
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}
	
	public void addError(String fieldName, String message) {
		errors.add(new FieldMessage(fieldName, message));
	}
	
}