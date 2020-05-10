// Example of a JMS message being sent.
TextMessage hello = context.createTextMessage();
hello.setText("Hello World!");
context.createProducer().send(hello);