# PlanGeneratorService

This service can be used to pre-calculated repayment plans throughout the lifetime of a loan.  Its created using **Maven**,**SpringBoot** and **Java 8**.  

Service spec is designed using Swagger and YAML file for the same is  src\main\resources\plangenerator.yaml  
Please import or copy paste yaml to Swagger online IDE to see the spec.  

**Swagger** : https://editor.swagger.io/    

Swagger YAML is integerataed to maven build process using swagger-codegen-maven-plugin and it will automatically generate the interfaces and models need for the service.      


### How to run the project?    

-  Clone project to a directory.  
-  **Run using maven:**  
      -   Install Maven 3.6.2  
      -   Open command prompt and navigate to clone directory and Execute command **mvn org.springframework.boot:spring-boot-maven-plugin:run** 
- **Run using docker**  
   -  Install docker
   -  Open command prompt and navigate to clone directory and Execute command **docker build -f Dockerfile -t plangenerator .**  
   -  **docker run -p 8080:8080 plangenerator**  
      
Service URL :  
http://localhost:8080/plangeneratorservice/v1/generate-plan  

Application versioning is used in url and 1 in v1 stands for application major version.  
If we have some major changes and need to support both old and new service this will help to have a new context v2. 



**Service is basic auth protected:**   
Credentials (username:password format):    
-   user:password     
     
**Actuator enabled for monitoring and tracing:**    
Credentials (username:password format):    
-   admin:admin  


http://localhost:8080/plangeneratorservice/v1/actuator  : This url will list all services available from actuator.  

**Imp Actuator URLs:**   
http://localhost:8080/plangeneratorservice/v1/actuator/health    
http://localhost:8080/plangeneratorservice/v1/actuator/httptrace  
http://localhost:8080/plangeneratorservice/v1/actuator/info    
http://localhost:8080/plangeneratorservice/v1/actuator/loggers   
http://localhost:8080/plangeneratorservice/v1/actuator/metrics   
http://localhost:8080/plangeneratorservice/v1/actuator/threaddump  
http://localhost:8080/plangeneratorservice/v1/actuator/auditevents  

**Caching is enabled, so same request will be processed from cache.**  
http://localhost:8080/plangeneratorservice/v1/actuator/caches  







