package org.jobjects.server;

import javax.jws.WebService;

/**
 * 
 * @author patronmi
 */
@WebService(
    portName = "AdditionPort",
    serviceName = "AdditionService",
    targetNamespace = "http://www.jobjects.org/wsdl",
    endpointInterface = "org.jobjects.server.AdditionWS")
public class Addition implements AdditionWS {

	public int add(int a, int b) throws MyException {
		return a + b;
	}
}
