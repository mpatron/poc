package org.jobjects.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * 
 * @author patronmi
 */
@WebService(targetNamespace = "http://www.jobjects.org/ws/", name = "AdditionWS")
public class AdditionWS {

	@WebMethod(operationName = "addition")
	public int add(int a, int b) throws MyException {
		return a + b;
	}
}
