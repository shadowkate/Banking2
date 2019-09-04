package com.ing.bank.exception;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ResponseError implements Serializable {

	private static final long serialVersionUID = 1L;
	private String statusMessage;
	private Integer statusCode;
	

	public ResponseError() {

	}


	public String getStatusMessage() {
		return statusMessage;
	}


	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}


	public Integer getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}


	public ResponseError(String statusMessage,Integer statusCode) {
		this.statusMessage = statusMessage;
		this.statusCode = statusCode;
	}

}
