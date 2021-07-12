# Java-Guide

Java, Maven, Redhat, JBoss and more is explained in this section. <br>

Official documentation <br>
https://docs.oracle.com/javaee/7/api/toc.htm

## Programming language

### Variables

final : Variable is final and CAN'T be modified. <br>

<h1>Java Basics</h1>
Section on the basics can be found here:<br>
https://github.com/KristoferMar/Java-Guide/tree/master/Basics_Java <br>

<h1>Java EE</h1>

Sample project:


<br>
<h2>Maven</h2>

Apache Maven is a build automation tool for Java projects. It helps us building Java projects with dependencies and special build requirements.
Mavn has serveral commands which are important to know.

<h3>.m2 repository folder</h3>
- Located in your home folder.


TEST <br>

Run All Test Methods <br>
<b><i>mvn test </i></b>

Validates project correcly and makes sure all necessary information is available. It also makes sure the dependencies are downloaded. <br>
<b><i>mvn validate</i></b>

Maven creates the build reult in the target folder. <br>
<b><i>mvn install</i></b>

To ensure that the build target is removed before a new build, add the clean target <br>
<b><i>mvn clean install</i></b>

<h3>Maven Dependecies</h3>
<h4>How to install (Intellij)</h4>
- Navigate to the pom press "command + N" and press "dependency". <br>
- search for the dependency you are looking for and press "add". <br>
- Refresh the project by rightclick on root folder <br><br>
Documentation:<br>
https://www.jetbrains.com/help/idea/work-with-maven-dependencies.html#generate_maven_dependency <br>
<br>
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

<br>
<h1>Enterprise Java Beans</h1>
Section is found here: <br>
<a href="https://github.com/KristoferMar/Java-Guide/tree/master/Enterprise%20Java%20Beans" target="_blank">https://github.com/KristoferMar/Java-Guide/tree/master/Enterprise%20Java%20Beans</a><br><br>
Documentation: <br>
<a href="asdfasadf" target="_blank">asdfasdf</a><br><br>
Life cykle documentation: <br>
<a href="https://docs.oracle.com/javaee/7/api/javax/annotation/package-summary.html" target="_blank">https://docs.oracle.com/javaee/7/api/javax/annotation/package-summary.html</a><br><br>


<br>
<h1>JAX-RS</h1>
Section can be found here: <br>
<a href="https://github.com/KristoferMar/Java-Guide/tree/master/JAX-RS" target="_blank">https://github.com/KristoferMar/Java-Guide/tree/master/JAX-RS</a><br><br>
Documentation: <br>
Inject: <br>
<a href="https://docs.oracle.com/javaee/7/api/toc.htm" target="_blank">https://docs.oracle.com/javaee/7/api/toc.htm</a><br><br>


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
Content:<br>
- EntityManager <br><br>

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

<br>
<h1>Testing</h1>
Why do we test? <br>
Testing your code teaches you how to write good code because you have to fix all of your bad code. <br><br>
We have multilpe ways in which we can test our code.
<br>
<h2>JUnit test</h2>
JUnit is a Regression Testing Framework used by developers to implement unit testing in Java, and accelerate programming speed and increase the quality of code. <br><br>
https://www.tutorialspoint.com/junit/junit_test_framework.htm<br>


<br>
<h3> Project setup </h3>

#### pom.xml

Project Object Model includes all details about the project and the configuration details used by maven. Some of the configurations are dependencies, the plugins or goals that can be executed, the build profiles, and so on. Other information such as the project version, description, developers, mailing lists and such can also be specified. More info below... <br>
https://maven.apache.org/guides/introduction/introduction-to-the-pom.html

#### .iml files

IML files are used for storing smaller sections of a larger development project. IntelliJ IDEA uses .IPR files for storing projects, which may reference multiple IML files. Both IPR and IML files use XML formatting. <br>
https://fileinfo.com/extension/iml

#### target folders

The target folder is the maven default output folder. When a project is build or packaged, all the content of the sources, resources and web files will be put inside of it, it will be used for construct the artifacts and for run tests. You can delete all the target folder content with mvn clean command.
