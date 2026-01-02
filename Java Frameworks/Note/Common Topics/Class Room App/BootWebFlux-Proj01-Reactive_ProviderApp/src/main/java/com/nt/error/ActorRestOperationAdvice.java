package com.nt.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ActorRestOperationAdvice {
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> handleRE(RuntimeException ex){
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleAllExeception(Exception ex){
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.OK);
	}
}
