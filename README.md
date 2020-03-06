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


### Project setup 

#### pom.xml

Project Object Model includes all details about the project and the configuration details used by maven. Some of the configurations are dependencies, the plugins or goals that can be executed, the build profiles, and so on. Other information such as the project version, description, developers, mailing lists and such can also be specified. More info below... <br>
https://maven.apache.org/guides/introduction/introduction-to-the-pom.html

#### .iml files
IML files are used for storing smaller sections of a larger development project. IntelliJ IDEA uses .IPR files for storing projects, which may reference multiple IML files. Both IPR and IML files use XML formatting. <br>
https://fileinfo.com/extension/iml

#### target folders
The target folder is the maven default output folder. When a project is build or packaged, all the content of the sources, resources and web files will be put inside of it, it will be used for construct the artifacts and for run tests. You can delete all the target folder content with mvn clean command.
