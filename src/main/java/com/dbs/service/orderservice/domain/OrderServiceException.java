package com.dbs.service.orderservice.domain;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderServiceException extends Exception{
	
	private static final long serialVersionUID=9874561233698L;
	private HttpStatus httpErrorCode;
	private String errormsg;
	
	public OrderServiceException(HttpStatus httpErrorCode, String errormsg) {
		super();
		this.httpErrorCode = httpErrorCode;
		this.errormsg = errormsg;
	}
	

}
