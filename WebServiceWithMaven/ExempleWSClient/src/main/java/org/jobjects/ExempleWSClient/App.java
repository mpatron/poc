package org.jobjects.ExempleWSClient;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.jobjects.wsdl.AdditionWS;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) throws Exception {
    Service service = Service.create(new URL("http://localhost:8080/ExempleWSServer/AdditionService?wsdl"), new QName(
        "http://www.jobjects.org/wsdl", "AdditionService"));

    AdditionWS addition = service.getPort(AdditionWS.class);

    System.out.println("Hello World! : " + addition.add(1, 2));
  }
}
