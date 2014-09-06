package org.jobjects.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * 
 * @author patronmi
 */
@WebService(targetNamespace = "http://www.jobjects.org/ws/", name = "HelloworldWS")
public class HelloworldWS {

	@WebMethod(operationName = "hello")
	public String sayHello(String name) throws MyException {
		return "Hello " + name + " !";
	}
}
