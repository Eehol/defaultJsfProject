# defaultJsfProject
This project contains a basic JSF configuration to start a web application :
  - Java 8
  - JSF
  - PrimeFaces
  - CDI
  - SLF4J (LOG4J implementation)
  - bundle labels configuration
  - JUnit, PowerMock
  - Apache Commons Utils

To start using this project, download it and run the following Maven command :
      mvn clean install
      
It will generates an archive webapp.war into defaultJsfProject\target\. 
You need to deploy it on your server (e.g. for wildfly you can deploy into the "deployments" folder.

Once it's deployed, you can browse to http://localhost:8080/webapp/index.jsf. 
If you see the following text, you have successfully deployed the application :
JSF2 Hello homepage
Hello World !
