cd D:\ProjetsJava\WebServiceWithMaven\ExempleWSServer\target\wsdl

@rem wsimport -keep -p org.acme.foo.hello -b common.jaxb HelloworldWSService.wsdl
@rem wsimport -keep -p org.acme.foo.add -b common.jaxb AdditionWSService.wsdl

wsimport -keep -p org.acme.foo.hello HelloworldWSService.wsdl
wsimport -keep -p org.acme.foo.add AdditionWSService.wsdl