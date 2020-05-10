// We use @Resource to map to where our Que is predefined on the server.
@Resource(mappedName = "java:jboss/jms/queue/helloWorldQueue")
private Queue helloWorldQueue;

// We setup the connection factory with @resource becuase it is predefined.
@Resource(mappedName = "java:comp/DefaultJMSConnectionFactory")
private static ConnectionFactory connectionFactory;

// We inject our JMSContext
@Inject
@JMSConnectionFactory("jms/MyConnectionFactory")
private JMSContext context;

@PostConstruct
public void init(){
	context = connectionFactory.createContext();
}



// MESSAGE PRODUCER TO SEND MESSAGE
JMSProducer producer = context.createProducer();        // Create JMSProducer using JMSContext and store in the producer.
TextMessage message = context.createTextMessage(msg);   // Use JMSContext to create TextMessage from string named msg.
producer.send(helloWorldQueue, message);                // Send message to helloWorldQueue using the producer variable.




// MESSAGE CONSUMER TO RECEIVE MESSAGES
JMSConsumer consumer = context.createConsumer(helloWorldQueue);         // Create JMSConsumer using JMS Context and pass helloWorldQue as destination. - Then store it in the consumer variable.

	try {
		TextMessage msg = (TextMessage) consumer.receiveNoWait();       // Use receiveNoWait to check for new message on queue but do not block if no message is available.
		if(msg != null) {
			System.out.println("Received Message: "+ msg);
			return msg.getBody(String.class);
		}else {
			return null;
		}
	}
	catch (Exception e) {
		e.printStackTrace();
		return null;
	} finally {
		consumer.close();                                               // Close consumer to release connection and conserve resources.
	}




// ConnectionFactory
// We need to provide the resource location of the connectionFactory.
@Resource(lookup = "java:jboss/ConnectionFactory")
private static ConnectionFactory connectionFactory;


// Context
JMSContext context = connectionFactory.createContext();


// Message Producer
JMSProducer producer = context.createProducer();
producer.send(dest, message);


// Message Consumer 
JMSConsumer consumer = context.createConsumer(dest);
Message m = consumer.receive();
