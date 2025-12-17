package com.nt.error;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ActorOperationsRestAdvice {
	
	//------------ Normal Global Exception ---------------------
//	@ExceptionHandler(exception = ActorNotFoundException.class)
//	public ResponseEntity<String> handleActorNotFoundException(ActorNotFoundException anfe){
//		return new ResponseEntity<String>(anfe.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//	}
//	
//	@ExceptionHandler(exception = Exception.class)
//	public ResponseEntity<String> handleException(Exception e){
//		return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
//	}
	
	
	//------------ Advance Global Exception ---------------------
	@ExceptionHandler(exception = ActorNotFoundException.class)
	public ResponseEntity<ErrorInfo> handleActorNotFoundException(ActorNotFoundException anfe){
		ErrorInfo info = new ErrorInfo(anfe.getMessage(),LocalDateTime.now(),500);
		return new ResponseEntity<ErrorInfo>(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(exception = Exception.class)
	public ResponseEntity<ErrorInfo> handleException(Exception e){
		ErrorInfo info = new ErrorInfo(e.getMessage(),LocalDateTime.now(),500);
		return new ResponseEntity<ErrorInfo>(info,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
