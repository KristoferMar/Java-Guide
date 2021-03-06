<h1>Messaging Application with JMS</h1>

We use JMS to create, use and orcistrate a message que in diffent kinds of applications. JMS Conists of multiple components and subcombonents which all come together to form a system with the intention to reade, write and handle tasks from a que. <br>

In Java Message Driven Applications you will need to find the JNDI which often is the jms-queue which you que messages in and read from. It's often located in '/opt/eap/standalone/configuration/Standalone-full.xml'. Here you can find <jms-queue configured and see the name of the que. <br>

Below we find the components which JMS consists of. <br>

<h2>JMS Client</h2>

JMS Clients are Java programs or applications that send or receive messages. <br>
It uses <br>

<h3>Connection Factory</h3>
- Object that a client uses to create a connection to the JMS provider.
- Often needs connection or authentication parameters predefined by a server admin.

Link: <br>
fasdfasd <br>

<h3>Connection</h3>
- Virtual connection to JMS provider.
- We use JMS Context to create this connection.

<h3>Session</h3>
- Single-threaded resource for eather sending or receiving messages, and is created by a connection.

<h3>Context</h3>
- Combination of a session and connection.
- You typically create a JMSContext object from the ConnectionFactory.

Link: <br>
sfsfdsdf <br>

<h3>Message Producer</h3>
- Created by JMS context, and used to send messages to a destiantion.

Example: <br>
fsdfsfsdf <br>

<h3>Message Consumer</h3>
- Used to receive messages from a destination synchronously.

Example: <br>
fssfsdfsdf <br>

<h2>Components of a JMS Message</h2>
Documentation: <br>
https://docs.oracle.com/javaee/7/api/javax/jms/Message.html

<h3>Headers</h3>
- We use header values on our message to specify behaviour of our data.
- Headers can be found in the documentation.

<h3>Properties</h3>
- Properties must be set prior to sending a message and are read-only.

<h3>Body</h3>
- The Message body allows developers to send data in many forms. <br>
- Differnt body types can be found in the documentaion. <br>
Example: <br>
sfsdfsdf


<br>
<h2>MDS's (Message Driven Beans)</h2>
- MDS's are used to enable asynchronous consumption of a message from a JMS destination. 
- All MDBs must implement the MessageListener interface.

Example: <br>
sfsdfsdf <br>

<h3>Annotations to configure an MDB</h3>
- DestinationLoopup <br>
- connectionFactoryLookup <br>
- destinationType <br>
- messageSelector <br>
- acknowledgeMode <br>

<h2>Queue Manager (QM)</h2>
It is the process of managing and optimizes queues to improve end-user waiting times and teammate productivity. <br>

Message channels: <br>
- It sends messages unidirectinally. <br>
- QM's create connections via MCA's. <br> 
- MCA 1 and 2 has to have the same types and they need to communicate on the same channel (both configured to A) <br>
- Eventually two QM's will become a pair <br>

![GitHub Logo](https://github.com/KristoferMar/Java-Guide/blob/master/Message%20App%20-%20JMS/Screenshot%202020-12-09%20at%203.00.19%20PM.png)
