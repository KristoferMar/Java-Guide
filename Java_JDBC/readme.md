<h1>Java JDBC</h1>

<h2>What is it?</h2>
JDBC stands for Java Database Connectivity. JDBC is a Java API to connect and execute the query with the database. It is a part of JavaSE (Standard Edition). JDBC API uses JDBC drivers to connect with the database. There are four types of JDBC drivers: <br>
- JDBC-ODBC Bridge Driver <br>
- Native Driver <br>
- Network Protocol Driver, and <br>
- Thin Driver <br>

We can use JDBC API to access tabular data stored in any relational database. By the help of JDBC API, we can save, update, delete and fetch data from the database. It is like Open Database Connectivity (ODBC) provided by Microsoft. <br>


<h2>PreparedStatment interface</h2>
The PreparedStatement interface is a subinterface of Statement. It is used to execute a parameterized query. <br>

Let's see the example of a parameterized query: <br>
<i>String sql="insert into emp values(?,?,?)";</i><br>

As you can see, we are passing parameter (?) for the values. It's value will be set by calling the setter methods of PreparedStatement. <br>
<h3>Why do we use it? </h3>
<b>Improves performance:</b> The performance of the application will be faster if you use PreparedStatement interface because query is compiled only once.<br>

Examples: <br>
<<<<<<< HEAD
https://github.com/KristoferMar/Java-Guide/blob/master/Java_JDBC/PreparedStatement.java <br>
=======
https://github.com/KristoferMar/Java-Guide/blob/master/Java_JDBC/PreparedStatement.java
>>>>>>> 7120e99b1f587f0600d84f43def0badd37b4bb62

<h3>Practical information</h3>
When execute a preparedStatement you have to bare in mind what kind of execution method to use. <br>
For example "executeUpdate()" can not be used to run queries. <br>

https://stackoverflow.com/questions/4756094/select-query-using-executeupdate-instead-of-executequery<br>

