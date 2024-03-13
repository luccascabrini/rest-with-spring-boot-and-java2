package br.com.luccas.exceptions;

import java.io.Serializable;
import java.util.Date;

//Serializable - E usado para serializacao e em caso de aplicacoes grandes da para fazer cache da instacia da classe em disco, pela rede etc 

public class ExceptionResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Date timestamp;
	private String message;
	private String details;
	
	public ExceptionResponse(Date timestamp, String message, String details) {
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	
}
