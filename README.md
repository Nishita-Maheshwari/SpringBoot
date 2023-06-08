# SpringBoot Introduction

 Before learning springboot, we should have the knowledge of spring framework

# Core concepts we should know :-
	-> Why we need spring framework ?
		= Dependecy Injection [lossly coupled]
		= Lightweight, simple and easy
		= Can be integrated with other frameworks
		  etc
 # What is bean ?
		= Bean is simple java object
		= Bean is the backbone in spring application which are managed by Spring IOC container
	-> How many ways we can create beans ?
		= We can create beans by 3 ways :-
			1. by using spring xml configuration
			2. by using @Component annotation [used at class level]
			3. by using @Bean (and @Configuration) annotation [used at method level]
	
==========> Springboot is used to boot our spring application <==========


# Springboot :-
	-> Springboot is an open source java-based framework which is developed by Pivotal Team
	-> It is used to create a stand-alone and production-grade spring-based application that we can "just run" i.e. it provides an easier way to start springboot application
	-> Springboot framework is developed on the top of core spring framework
	
# Advantages of Springboot :-
		1. It follows "Opinionated Defaults Configuration" approach to reduce developer efforts
		2. It aviods boilerplate code, annotations and xml configurations which in turn reduces the developer time and increases the productivity
		3. It can be easily integrated with Spring Modules i.e. Spring JDBC, Spring AOP, Spring Security etc
		4. It provides embdded HTTP servers i.e. tomcat, jetty etc
		5. It provides CLI (Command Line Interface) tool to develop and test springboot application from command prompt in an easy and quick way
		6. It provides a lot of plugins to develop and test springboot applications
		7. It provides a lot of plugins to work with embedded and in-memory databases
		   etc
		   
 # Key components of Springboot Framework :-
		1. Springboot Starters
		2. Springboot AutoConfigurator
		3. Springboot CLI
		4. Springboot Actuators
		
   # ----------------

# Springboot Starters :-
	-> Springboot starters are the "dependency descriptors"
	-> Springboot provides a number of starters that allow us to add jar files in the classpath
	-> In springboot, all the starters follows a similar name pattern i.e. "spring-boot-starter-*" for example spring-boot-starter-web, spring-boot-starter-jdbc etc
	-> Springboot starters are divided in 3 categories :-
		a. Application Starters
			= spring-boot-starter
			= spring-boot-starter-web
			= spring-boot-starter-jdbc
			= spring-boot-starter-aop
			= spring-boot-starter-test
			  etc
		b. Technical Starters
			= spring-boot-starter-tomcat
			= spring-boot-starter-jetty
			= spring-boot-starter-logging
			= spring-boot-starter-log4j
			  etc
		c. Production Starters
			= spring-boot-starter-actuators
	-> NOTE : "spring-boot-starter" name is reserved for official spring boot artifacts
	
# Syntax of springboot starters :-
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-web</artifactId>
				<version>2.7.0</version>
			</dependency>
			
	-> There are many third party starters which we can include in our applications
	-> Third party starters follows the below name patter :-
		= projectname-spring-boot-starter
# ---------------------------

# Springboot AutoConfigurator :-
	-> Springboot AutoConfigurators, automatically configures the spring application configurations based on the jar dependencies that we have added
	-> All auto-configuration logic is implemented in "spring-boot-autoconfigure.jar"
	-> pringboot AutoConfigurator provides one annotation i.e. @SpringBootApplication
		= @SpringBootApplication = @Configuration + @ComponentScan + @EnableAutoConfiguration
# -----------------------









# Different ways to create Springboot Applications :-
	1. using Maven Project in Eclipse
	2. installing STS Tool in Eclipse
	3. using STS (Spring Tool Suit) IDE
	4. using Springboot Initializr
	5. using Springboot CLI (Command Line Interface)
	


# => Springboot Annotations :-
	-> Springboot annotations are present in following packages :-
		= org.springframework.boot.autoconfigure
		= org.springframework.boot.autoconfigure.condition
	-> Some common annotations used are :-
		= @SpringBootApplication
		= @AutoConfiguration
		= @EnableAutoConfiguration
		= @ImportAutoConfiguration
		= Conditional Annotations :-
			- @Conditional
			- @ConditionalOnBean and @ConditionalOnMissingBean
			- @ConditionalOnClass and @ConditionalOnMissingClass
			  etc
			  


# => Tasks performed by run method :-
	-> Calculate the duration of project started
	-> Creates ApplicationContext object
	-> Start the listeners
	-> Prepares the environment i.e. production or dev or test environment
	-> Print the banner
	-> Trigger the Runners
	   etc
	
# ------------------------------------------------------






# SpringBoot with JDBC

![MVC_lyst8542](https://github.com/Nishita-Maheshwari/SpringBoot/assets/47790697/bd6366d4-a385-4af4-ab67-48ac5482d965)


![eclipse_lyst1295](https://github.com/Nishita-Maheshwari/SpringBoot/assets/47790697/dd4e937b-354e-41cd-a258-0f01a0b65403)


![image](https://github.com/Nishita-Maheshwari/SpringBoot/assets/47790697/b0a263cd-4ca3-4c08-afd0-a0b1054b3700)









# Springboot Data JPA

![image](https://github.com/Nishita-Maheshwari/SpringBoot/assets/47790697/c90165ed-1495-4986-abf1-89c620c11a0a)





# -----------------------

# What is API, Web Services and MicroServices ?


# => API :-
	-> Full form of API is Application Programming Interface
	-> API is an application component (or piece of code) which is used for communication between different systems over the network
	-> API acts as bridge between different systems or devices
	-> For example :-
		= Login API's (google and facebook login API)
		= Google Map API's
		= Payment Gateway API's
		= Airline, Bus, Train Booking API's
		= Movie Booking API's
		= Weather API's
		= Youtube, Amazon, Flipkart API's etc
		  etc
  # -> Types of API's :-
		1. Public or Open API's
			= These are open to the public which can be used by anyone.
			= These API's can be paid or free of cost
		2. Partner API's
			= These API's are meant for business-to-business partnership
		3. Private or Internal API's
			= These are internal to any specific enterprice application within the company
		4. Composit API's
			= These combine any two or more different API's for any system or project

# ------------------------------

# => Web Services :-
	-> Web Services are a type of API used to exchange the data (XML or JSON) between different systems over the network
	-> Web services are independent of the platform on which they are developed. For example if we have created web services in java, then it can communicate with any other language also like python or php etc
	-> Web services use HTTP protocol
	-> NOTE :-
		= All web services are API's but not all API's are web services
		= To test web services we will use "Postman" tool
	-> There are 2 types of web services :-
		= SOAP web services
		= RESTful web services
	
# ==============================

# => Microservices :-
	-> Microservices is software architecture used to design an application. The idea behind the application development is that "create small independent components (or services) which performs simple task, then merge or integrate them into a single unit to build a large complex application"
	-> Monolithic approch was replaced by Microservices
	-> Advantages of Microservices :-
		= easy to scale
		= fast to develop
		= easy to maintain
		= easy to test
		= easy to deploy
		  etc
	-> There are many technologies to develop microservices but mostly used technology is Java and its frameworks (Springboot, Spark, DropWizard, Jersey etc)

# ----------------

=> Resources :-

=> HTTP :-

=> Postman :-

# ----------------------
![image](https://github.com/Nishita-Maheshwari/SpringBoot/assets/47790697/e9f9e187-ffff-4579-badc-5f4c9e99c431)













![image](https://github.com/Nishita-Maheshwari/SpringBoot/assets/47790697/15c87a57-9425-4164-9de4-fafb49890d5a)











![image](https://github.com/Nishita-Maheshwari/SpringBoot/assets/47790697/e31ae79e-d23b-4a43-9ca8-9334531333eb)












# -----------------------

# RESTful Web Services


# => Resources :-
	-> Resource is the simple files i.e. html or images or data which are present on server
	-> To access the resource from server we use URI

-----------------------------------------------------

# => HTTP :-
	-> Full form is "Hyper Text Transfer Protocol"
	-> HTTP is a protocol (TCP/IP based communication protocol) that is used to transfer the resources over www (world wide web)
	-> Other common protocols are :-
		= FTP (File Transfer Protocol)
		= SMTP (Simple Mail Transfer Protocol)
		= IMAP (Internet Message Access Protocol)
		= MIME (Multipurpose Internet Mail Extension)
		  etc
	-> HTTP was developed by Tim-Berners-Lee and his team
	-> HTTP request methods are :-
		= GET
		= POST
		= PUT
		= PATCH
		= DELETE
		  etc

-----------------------------------------------------------

# => What is difference between SOAP and REST :-
	= SOAP : Simple Object Access Protocol
	  REST : REpresentational State Transfer
	  
	= SOAP : It is a "protocol" which follows a strict standard to allow communication between the client and server
	  REST : It is an "architectural style" that does not follows any strict standard (but follows its own 6 constraints)
	  
	= SOAP cannot use REST because SOAP is a protocol without any architectural style and REST does not follows the protocol
	  REST can use SOAP because it is an architectural style which can have protocols
	  
	= SOAP transports the data in standard XML format
	  REST transports the data in different formats i.e. JSON, XML, Plain Text, HTML etc
	  
	= SOAP requires more bandwidth as compared to REST
	  REST requires less bandwidth as compared to SOAP
	  
	= SOAP is difficult to implement
	  REST to easy to implement
	  
	= SOAP is outdated web service
	  REST is traditional web service

---------------------------------------------------------

# => Difference between REST and RESTful :-
	-> REST is the set of constraints. There are 6 main constraints :-
		= Client-Server Architecture
		= Stateless
		= Uniform Interface
		= Cacheable
		= Layered System
		= Code on Demand (optional)
	-> RESTful refers to the API adhering to these constraints
	

# => RESTful Web Services :-
	-> REST full form is
		= REpresentational - it should support JSON and XML
		= State - State means data or value of an object
		= Transfer - transfer the state using HTTP protocol
	-> REST was developed by Roy Fielding (he is the only one who provides the HTTP specifications)
	-> We can develop RESTful web services in multiple frameworks i.e. JAX-RS, Springboot, Jersey etc

---------------------------------------

# => XML and JSON format :-
	

------------------------------------------

# => Postman :-
	-> It is a tool used to test the RESTful API

===================================

![URI_lyst9213](https://github.com/Nishita-Maheshwari/SpringBoot/assets/47790697/3c1a4193-82e8-4cba-a7fc-7696e2eeb889)

![image](https://github.com/Nishita-Maheshwari/SpringBoot/assets/47790697/21ce1864-3f7e-4546-9805-d25517b1c8b1)










![image](https://github.com/Nishita-Maheshwari/SpringBoot/assets/47790697/ff60add3-75ea-4aaf-8a45-86da0e1f12f3)


![image](https://github.com/Nishita-Maheshwari/SpringBoot/assets/47790697/75b4f8fd-0e0b-47c4-b678-0b7b08630571)


