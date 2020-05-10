// Reviewing Message Listener Interface
public class QueueListener implements MessageListener {

	private final static Logger LOGGER = Logger.getLogger(this.class.getName());

	public void onMessage(Message rcvMessage) {
		TextMessage msg = null;

		try {
			if (rcvMessage instanceof TextMessage) {
				msg = (TextMessage) rcvMessage;
				LOGGER.info("Received Message from helloWorldQueue ===> " + msg.getText());
			} else {
				LOGGER.warn("Incorrect Message Type!");
			}
		} catch (JMSException e) {
			throw new RuntimeException(e);
		}
	}
...



// Using annotation to configure an MDB
// This example can be applied on the example above
@MessageDriven(name = "QueueListener", activationConfig  = {                                                // @MessageDriven gets a name which is technically optinal. "activationConfig" is required and passes in a set of @ActivationConfigProertiy annotaions.
  @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue/helloWorldQueue"),   // "destinationlookup" sets the JNDI name of the destination that the MDB should listen on.
  @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")            // "destinationType" specifies whether the destination is a queue or a topic (Property is optional)
})
public class QueueListener implements MessageListener {

    