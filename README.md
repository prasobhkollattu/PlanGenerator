# PlanGenerator

This service can be used to pre-calculated repayment plans throughout the lifetime of a loan.  Its build using SpringBoot and Java8.  

Service spec is designed using Swagger and YAML file for the same is  src\main\resources\plangenerator.yaml  
Please import or copy paste yaml to Swagger online IDE to see the spec.  

Swagger : https://editor.swagger.io/    

Swagger YAML is integerataed to maven build process using swagger-codegen-maven-plugin and it will automatically generate the interfaces and models need for the service.      


How to run the project?    

-  Clone project to a directory.  
-  Run using maven:  
      a. Install Maven 3.6.2  
      b. Open command prompt and navigate to clone directory and Execute command mvn spring-boot:run  
3.Run using docker  
      a. Install docker  
      b. Open command prompt and navigate to clone directory and Execute command docker build -f Dockerfile -t plangenerator .  
      c. docker run -p 8080:8080 plangenerator  
      
Service URL :  
http://localhost:8080/v1/generate-plan  

Service is basic auth protected:  
Credentials (username:password format):  
1.user:password  
2,admin:admin  
     



