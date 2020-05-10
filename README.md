# Java-Guide

Java, Maven, Redhat, JBoss and more is explained in this section. <br>

Official documentation, also used in the RedHat Exam: <br>
https://docs.oracle.com/javaee/7/api/toc.htm

## Programming language

### Variables

final : Variable is final and CAN'T be modified. <br>

## Maven

Apache Maven is a build automation tool for Java projects. It helps us building Java projects with dependencies and special build requirements.
Mavn has serveral commands which are important to know.

TEST <br>

Run All Test Methods <br>
<b><i>mvn test </i></b>

Validates project correcly and makes sure all necessary information is available. It also makes sure the dependencies are downloaded. <br>
<b><i>mvn validate</i></b>

Run a Single Unit Test <br>
<b><i>mvn -Dtest=UsersServiceImpl#testCreateUser test</i></b>

More info: <br>
http://www.appsdeveloperblog.com/running-a-single-unit-test-with-maven/

### Project

Download / Compile all needed components in project <br>
<b><i>mvn install</i></b>

Compile the source code of the project
<b><i>mvn compile</i></b>

Resolve all project dependencies <br>
<b><i>mvn dependency:resolve</i></b>

# JAX-RS

JAX-RS: Java API for RESTful Web Services (JAX-RS) is a java programming language API spec that provides support in creating web services according to the REST architectural pattern. <br>

JAX-RS: javax.ws.rs includes the following annotations.

@ApplicationPath("/api") <br>

- Identifies the application path that servers as the base URI for all resource URIs provided by Path. May only be applied to a subclass of Application. Found below <br>
  https://github.com/KristoferMar/Java-Guide/blob/master/RestAPI/src/main/java/com/appdev/cic/RestAPI/rest/JaxRsActivator.java

@Path("/somePath") <br>

- Identifies the URI path that a resource class or class method will serve requests for.

@PathParam()

- Binds the value of a URI template parameter or a path segment containing the template parameter to a resource method parameter.

@GET

- Indicates that the annotated method responds to HTTP Get request.

@POST

- Indicates that the annotation method responds to HTTP POST request.

@PUT

- Indicates that the annotated method responds to HTTP PUT requests.

@DELETE

- Indicates that the annotated method responds to HTTP DELETE requests.

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

- Defines the media types that the methods of a resource class or MessageBodyReader can accept and produce.

<br>
<h1>Context and Dependecy Injection </h1>
Section can be found here: <br>
<a href="https://github.com/KristoferMar/Java-Guide/tree/master/Context-Dependency-Injection" target="_blank">https://github.com/KristoferMar/Java-Guide/tree/master/Context-Dependency-Injection</a><br><br>
Documentation: <br>
Inject: <br>
<a href="https://docs.oracle.com/javaee/7/api/javax/enterprise/inject/package-summary.html" target="_blank">https://docs.oracle.com/javaee/7/api/javax/enterprise/inject/package-summary.html</a><br><br>

<br>
<h1>Managing Persistance</h1>
Section is found here: <br>
<a href="https://github.com/KristoferMar/Java-Guide/tree/master/Managing%20Persistance" target="_blank">https://github.com/KristoferMar/Java-Guide/tree/master/Managing%20Persistance</a><br><br>
Documentation: <br>
<a href="https://docs.oracle.com/javaee/7/api/javax/validation/package-summary.html" target="_blank">https://docs.oracle.com/javaee/7/api/javax/validation/package-summary.html</a><br><br>

<br>
<h1>Managing Entity Relationships</h1>
Section is found here: <br>
<a href="https://github.com/KristoferMar/Java-Guide/tree/master/Entity%20Relationship" target="_blank">https://github.com/KristoferMar/Java-Guide/tree/master/Entity%20Relationship</a><br><br>
Documentation: <br>
<a href="https://docs.oracle.com/javaee/7/api/javax/persistence/package-summary.html" target="_blank">https://docs.oracle.com/javaee/7/api/javax/persistence/package-summary.html</a><br><br>

<br>
<h1>Messaging Applications with JMS</h1>
Section is found here: <br>
<a href="https://github.com/KristoferMar/Java-Guide/tree/master/Message%20App%20-%20JMS" target="_blank">https://github.com/KristoferMar/Java-Guide/tree/master/Message%20App%20-%20JMS</a><br><br>
Documentation: <br>
<a href="https://docs.oracle.com/javaee/7/api/javax/jms/package-summary.html" target="_blank">https://docs.oracle.com/javaee/7/api/javax/jms/package-summary.html</a><br><br>

<br>
<h1>Securing Java EE Applications</h1>
Section is found here: <br>
<a href="https://github.com/KristoferMar/Java-Guide/tree/master/Securing%20Java%20EE%20Applications" target="_blank">https://github.com/KristoferMar/Java-Guide/tree/master/Securing%20Java%20EE%20Applications</a><br><br>
Documentation: <br>
<a href="https://docs.oracle.com/javaee/7/api/javax/annotation/security/package-summary.html" target="_blank">https://docs.oracle.com/javaee/7/api/javax/annotation/security/package-summary.html</a><br><br>

### Project setup

#### pom.xml

Project Object Model includes all details about the project and the configuration details used by maven. Some of the configurations are dependencies, the plugins or goals that can be executed, the build profiles, and so on. Other information such as the project version, description, developers, mailing lists and such can also be specified. More info below... <br>
https://maven.apache.org/guides/introduction/introduction-to-the-pom.html

#### .iml files

IML files are used for storing smaller sections of a larger development project. IntelliJ IDEA uses .IPR files for storing projects, which may reference multiple IML files. Both IPR and IML files use XML formatting. <br>
https://fileinfo.com/extension/iml

#### target folders

The target folder is the maven default output folder. When a project is build or packaged, all the content of the sources, resources and web files will be put inside of it, it will be used for construct the artifacts and for run tests. You can delete all the target folder content with mvn clean command.
