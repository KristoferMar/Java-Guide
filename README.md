# Java-Guide
Java, Maven, Redhat, JBoss and more is explained in this section.

## Programming language

### Variables 

final : Variable is final and CAN'T be modified. <br>

## Maven 

Apache Maven is a build automation tool for Java projects. It helps us building Java projects with dependencies and special build requirements.
Mavn has serveral commands which are important to know.

TEST <br>

Run All Test Methods <br>
<b><i>mvn test </i></b>

Run a Single Unit Test <br>
<b><i>mvn -Dtest=UsersServiceImpl#testCreateUser test</i></b>

More info: <br>
http://www.appsdeveloperblog.com/running-a-single-unit-test-with-maven/

### Project setup 

#### pom.xml

Project Object Model includes all details about the project and the configuration details used by maven. Some of the configurations are dependencies, the plugins or goals that can be executed, the build profiles, and so on. Other information such as the project version, description, developers, mailing lists and such can also be specified. More info below... <br>
https://maven.apache.org/guides/introduction/introduction-to-the-pom.html
