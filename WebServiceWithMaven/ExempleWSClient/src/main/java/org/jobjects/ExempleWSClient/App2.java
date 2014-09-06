package org.jobjects.ExempleWSClient;

import java.io.File;
import java.io.FileInputStream;
import java.net.InetSocketAddress;
import java.security.KeyStore;
import java.security.SecureRandom;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.security.auth.login.Configuration;
import javax.xml.ws.Endpoint;

public class App2 {

  public static void main(String[] args) {
//    // TODO Auto-generated method stub
//    SSLContext ssl = SSLContext.getInstance("SSLv3");
//    KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
//    KeyStore store = KeyStore.getInstance(KeyStore.getDefaultType());
//    String password = Configuration.getConfig("keyStorePassword");
//    store.load(new FileInputStream(new File(Configuration.getConfig("keyStore"))), password.toCharArray());
//    kmf.init(store, password.toCharArray());
//    KeyManager[] keyManagers = new KeyManager[1];
//    keyManagers = kmf.getKeyManagers();
//    TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
//    tmf.init(store);
//    TrustManager[] trustManagers = tmf.getTrustManagers();
//    ssl.init(keyManagers, trustManagers, new SecureRandom());
//
//    HttpsConfigurator configurator = new HttpsConfigurator(ssl);
//    Integer port = Integer.parseInt(Configuration.getConfig("port"));
//    HttpsServer httpsServer = HttpsServer.create(new InetSocketAddress(Configuration.getConfig("host"), port), 0);
//    httpsServer.setHttpsConfigurator(configurator);
//
//    Implementor implementor = new Implementor(); // class with @WebService etc.
//    HttpContext context = (HttpContext) httpsServer.createContext("/EventWebService");
//    Endpoint endpoint = Endpoint.create( implementor );
//    endpoint.publish(context);
  }

}
