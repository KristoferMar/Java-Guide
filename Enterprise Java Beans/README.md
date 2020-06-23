<h1>Enterprise Java Beans</h1>

There are two kinds of beans. <br>
1. Session: Usally an application's core business logic is exposed as high-level API.<br>
2. Message Driven Bean (MDB): Used for asyncronous communication between components in a java EE application and can be used to receive Java Message Service (JMS) messages. <br>

<h2>Session Beans</h2>
A bean has a defined session which can varay. <br>

<h3>Stateless Session Beans (SLSB)</h3>

<h3>Stateful Session Beans (SFSB)</h3>
- Maintain conversational state witch client across multiple calls.
Example: <br> 
<a href="https://github.com/KristoferMar/Java-Guide/blob/master/Enterprise%20Java%20Beans/StatefulSessionBean.java" target="_blank">https://github.com/KristoferMar/Java-Guide/blob/master/Enterprise%20Java%20Beans/StatefulSessionBean.java</a><br><br>

<h3>Singleton Sesson Beans</h3>

<h3>Message Driven Beans</h3>

<h2>Converting POJO to an EJB</h2>
- The way we convert a POJO to an EJB is that we give it a session.
- We do that by annotating it's session parameter like @Stateless

Example: <br>
<a href="https://github.com/KristoferMar/Java-Guide/blob/master/Enterprise%20Java%20Beans/FromPOJOtoEJB.java" target="_blank">https://github.com/KristoferMar/Java-Guide/blob/master/Enterprise%20Java%20Beans/FromPOJOtoEJB.java</a><br><br>

<h2>Accessing EJBs Locally and Remotely</h2>
- We access local EJBs by annotating @EJB above a private ejb variable in another class.
Example local: <br>
<a href="https://github.com/KristoferMar/Java-Guide/blob/master/Enterprise%20Java%20Beans/AccessEJB.java" target="_blank">https://github.com/KristoferMar/Java-Guide/blob/master/Enterprise%20Java%20Beans/AccessEJB.java</a><br>
Example Remote: <br>
<a href="https://github.com/KristoferMar/Java-Guide/blob/master/Enterprise%20Java%20Beans/AccessRemoteEJB.java" target="_blank">https://github.com/KristoferMar/Java-Guide/blob/master/Enterprise%20Java%20Beans/AccessRemoteEJB.java</a><br><br>


<h2>Transaction Attributes</h2>
- Transactions makes sure that we can rollback whenever some business logic from an EJB is executed and fails on it's way. 

We have the following transaction annotations. <br>
<h3>@TransactionAttribute(TransactionAttributeType.REQUIRED)<h3>
<h3>@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)<h3>
<h3>@TransactionAttribute(TransactionAttributeType.MANDATORY)<h3>
<h3>@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)<h3>
<h3>@TransactionAttribute(TransactionAttributeType.SUPPORTS)<h3>
<h3>@TransactionAttribute(TransactionAttributeType.NEVER)<h3>

Example of multiple: <br>
<a href="https://github.com/KristoferMar/Java-Guide/blob/master/Enterprise%20Java%20Beans/TransactionAttributes.java" target="_blank">https://github.com/KristoferMar/Java-Guide/blob/master/Enterprise%20Java%20Beans/TransactionAttributes.java</a><br><br>

Acutal Example:<br>
<a href="https://github.com/KristoferMar/Java-Guide/blob/master/Enterprise%20Java%20Beans/TransactionExample.java" target="_blank">https://github.com/KristoferMar/Java-Guide/blob/master/Enterprise%20Java%20Beans/TransactionExample.java</a><br><br>
