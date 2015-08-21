package org.jobjects.server;

import javax.xml.ws.WebFault;

/**
 * 
 * @author patronmi
 */
@WebFault(targetNamespace = "http://www.jobjects.org/ws/exception", name = "MyException")
public class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MyException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
