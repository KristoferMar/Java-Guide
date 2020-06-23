<h1>Managing Persistance</h1>

<h1>JPA Annotations</h1>

<h4>@Entity</h4>
- Is a pojo which has data which is actually goint to persit it to the database.
- Database table name and class name needs to be the same -> else you have to use the annotation below:

<h4>@Table</h4>
- Used to Map a class to a table in database.

<h4>@Column</h4>
- Maps the field name and the column name in the database.

<h4>@Transiant</h4>
- Used to mark fields which are NOT going to be persitent to the database.

<h4>@Id</h4>
- Used to specifiy which field in you entity represents the primary key column in the database. <br>
- Your id must be some type of mutable type and there are 4 types to do that. <br>
    - @GeneratedValue(GenerationType.AUTO) --> Default strategy. <br>
    - @GeneratedValue(GenerationType.SEQUENCE) <br>
    - @GeneratedValue(GenerationType.IDENTITY) --> uses the database identity column. = unique identifier field. <br>
    - @GeneratedValue(GenerationType.TABLE) --> Here you pull a number of items from the database to generate your value. <br>

<br>
<h2>Annotating classes to validate beans</h2>
Package used:
<a href="https://docs.oracle.com/javaee/7/api/javax/validation/constraints/package-summary.html" target="_blank">https://docs.oracle.com/javaee/7/api/javax/validation/constraints/package-summary.html</a><br><br>

Annotations assosiated with bean validation.<br>

<h4>@NotNull</h4>
- Verifies that value in field or property is not null

<h4>@Null</h4>
- Verifies that the value is null

<h4>@Size</h4>
- Verifies that the size of the field is between min and max including boundary values

<h4>@Min</h4>
- Verifies the value is higher or equal to the minimum value set.

<h4>@Max</h4>
- Verifies the value is less then or equal to the maximum accepted value.

<h4>@Digists</h4>
- Verifies the precision and scale of the field. <br>
- Example: <br>
@Digits(integer=7, fraction,2) <br>
private double monthlySale;

<h4>@DecimalMin</h4>
- Verifies that the decimal value is geather than or equal to the value defined in the DecimalMin. (Takes a string)

<h4>@DecimalMax</h4>
- Verifies that the decimal value is kess than or equal to the value defined in the decimalMax. (takes a string)

<h4>@Future</h4>
- Verifies it is a date in the future.
<h4>@Past</h4>
- Verifies it is a date in the past.

<h4>@Pattern</h4>
- Lets us insert regular expressions to take in only a phone number for example.

<h4>@AssertFalse</h4>
- Verifies that our incoming value is false.

<h4>@AssertTrue</h4>
- Verifies that our incoming value is true.

<br>
<h1>Entity Manager</h1>
Documentation: <br>
https://docs.oracle.com/javaee/7/api/javax/persistence/EntityManager.html <br> <br>

- The Entity Manger handles all our CRUD opperations.
- The entity manager can be created in the following ways but it's easiest to creat it thorugh CDI:
- We use the entity manger on entities.

<h3>EntityManager methods</h3>
<h4>persist()</h4>
- Persits an entity an makes it managed. <br>
- Inserts a row in a database table. <br>
<h4>find()</h4>
- searches an entity of a specific class by its primary key and returns a managed entity instance. <br>
- If not found it returns null. <br>
<h4>contains()</h4>
- Takes an instance as an argument and checks whether the instance is in the persistence context. <br>
<h4>merge()</h4>
- Updates the data in a table for an existing detached entity. 
- Inserts a new row in a database table for an entity that is new or a transient state. 
<h4>remove()</h4>
- Deletes a detached entity.<br>
- Remove needs to find entity first: entityManager.remove(entityManager.find(Customer.class, cusId))
<h4>clear()</h4>
- Clears the persistence context. 
- After execution all managed entities are in a detached state.
<h4>refresh()</h4>
- Refreshes the state of an entity instance from a database table.<br>

We are also able to query an entity with the entity manager which is an important part of the entity manager class.<br>

<br>
<h2>Creating Queries</h2>
Documentation: <br>
<a href="https://docs.oracle.com/javaee/7/api/javax/persistence/EntityManager.html#createQuery-java.lang.String-" target="_blank">https://docs.oracle.com/javaee/7/api/javax/persistence/EntityManager.html#createQuery-java.lang.String-</a><br>

JPQL = Java Persistence Querry language. <br>

Supported operators: <br>

- <, =, >, <=, >=, <><br>
- IN, NOT IN<br>
- LIKE, NOT LIKE.<br>
- BETWEEN & NOT BETWEEN.<br>
- MEMBER OF, NOT MEMBER OF, IS EMTY & IS NOT EMPTY<br>

Example of use: <br>

<p>Retrieve records of all employees from a database:<p> <br>
<i>entityManager.createQuery("SELECT e FROM Employee e");</i> <br>

<p>Retrieve records of all employees from a database but with uppercase:<p> <br>
- LOWER, UPPER, LENGTH are all supported. <br>
<i>entityManager.createQuery("SELECT UPPER(e.empName) from Employee e");</i> <br>

<p>Retrieve records for specific salary:<p> <br>
<i>entityManager.createQuery("SELECT e from Employee e where e.salary >120000");</i> <br>

<h3>Dynamic query types</h3>
<h4>Named Parameters in Queries</h4>
- We are able to specify a variable name which can be used in a query and changed dynamically <br>
- We create a query variable with ":variable" and afterwards we have to set the parameter for the variable below. See example. <br>
Example: <br>
Query query=entityManager.createQuery("SELECT e from Employee e where e.salary >:sal"); <br>
query.setParameter("sal", salary);<br><br>

<h4>Positional Parameters in Queries</h4>
- We are able to specify a variable position which can be used in a query and changed dynamically <br>
- We create a query position variable with "?1", "?2", ... and afterwards we have to set the parameter for the variable below. <br>
Example: <br>
Query query=entityManager.createQuery("SELECT e from Employee e where e.salary >?1"); <br>
query.setParameter(1, salary); <br>

<h3>Named Queries</h3>
- This means that we create the NamedQuery() already inside the entity class. <br>
- We refer to the entity query name when we want to use. <br>

example: <br>
<a href="https://github.com/KristoferMar/Java-Guide/blob/master/Managing%20Persistance/EntityQueries.java" target="_blank">https://github.com/KristoferMar/Java-Guide/blob/master/Managing%20Persistance/EntityQueries.java</a>

<h3>Extra</h3>
If MySQLDS is configured in JBoss you can often find it with following path: <br>
<i>less /opt/eap/standalone/configuration/\standalone-full.xml</i><br>