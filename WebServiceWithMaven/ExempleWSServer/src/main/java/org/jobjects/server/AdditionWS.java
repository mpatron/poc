package org.jobjects.server;

import javax.jws.WebService;

@WebService(targetNamespace = "http://www.jobjects.org/wsdl")
public interface AdditionWS {
  int add(int a, int b) throws MyException;
}
