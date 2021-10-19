<h1>JAX-RS</h1>

JAX-RS: Java API for RESTful Web Services (JAX-RS) is a java programming language API spec that provides support in creating web services according to the REST architectural pattern. <br>

JAX-RS: javax.ws.rs includes the following annotations.

@ApplicationPath("/api") <br>

- Identifies the application path that servers as the base URI for all resource URIs provided by Path. May only be applied to a subclass of Application. Found below <br>
  https://github.com/KristoferMar/Java-Guide/blob/master/RestAPI/src/main/java/com/appdev/cic/RestAPI/rest/JaxRsActivator.java

@Path("/somePath") <br>

- Identifies the URI path that a resource class or class method will serve requests for.

@PathParam()

- Binds the value of a URI template parameter or a path segment containing the template parameter to a resource method parameter.

@GET

- Indicates that the annotated method responds to HTTP Get request.

@POST

- Indicates that the annotation method responds to HTTP POST request.

@PUT

- Indicates that the annotated method responds to HTTP PUT requests.

@DELETE

- Indicates that the annotated method responds to HTTP DELETE requests.

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

- Defines the media types that the methods of a resource class or MessageBodyReader can accept and produce.

<h3>Scopes</h3>
A rest API service class can be annotated with different kinds of scopes what determine how the service can hold state for the incoming and outgoing request. We have the following: 

@RequestScoped

- A user’s interaction with a web application in a single HTTP request.

@SessionScoped

- A user’s interaction with a web application across multiple HTTP requests.

@ApplicationScoped

- Shared state across all users’ interactions with a web application.

@Dependent

- The default scope if none is specified; it means that an object exists to serve exactly one client (bean) and has the same lifecycle as that client (bean).

@ConversationScoped

- A user’s interaction with a JavaServer Faces application, within explicit developer-controlled boundaries that extend the scope across multiple invocations of the JavaServer Faces lifecycle. All long-running conversations are scoped to a particular HTTP servlet session and may not cross session boundaries.

<br>
<h3>Example if implementation</h3>
<a href="https://github.com/KristoferMar/Java-Guide/blob/master/RestAPI/src/main/java/com/appdev/cic/RestAPI/rest/MemberResourceRESTService.java" target="_blank">https://github.com/KristoferMar/Java-Guide/blob/master/RestAPI/src/main/java/com/appdev/cic/RestAPI/rest/MemberResourceRESTService.java</a><br><br>
