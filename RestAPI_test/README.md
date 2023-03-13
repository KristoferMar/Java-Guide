# Focus on test

## Testcontainers
Framework used to spinup dedicated testcontainers for integration tests for java code.

### Notes
To keep a test container running for reuse you might have to set environment variable

1. set .withResuse(true) on the java object

2. In home directory add you need to 
- Add .testcontainers property file
- In that file you need to add "testcontainers.reuse.enable=true"

3. You have to get rid of the @Testcontainers annotation and the @Container annotation and you have to use testcontainers manually. 

4. You then use @BeforeAll and runcontainer.start() instead. Also remember to stop them in the @after class