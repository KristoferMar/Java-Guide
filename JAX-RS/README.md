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


<br>
<h3>Example if implementation</h3>
<a href="https://github.com/KristoferMar/Java-Guide/blob/master/RestAPI/src/main/java/com/appdev/cic/RestAPI/rest/MemberResourceRESTService.java" target="_blank">https://github.com/KristoferMar/Java-Guide/blob/master/RestAPI/src/main/java/com/appdev/cic/RestAPI/rest/MemberResourceRESTService.java</a><br><br>

<h2>Related dependencies</h2>
<h3>lombok</h3>
It's a java library that automatically plugs into your editor and builds tools, spicing up your java. <br>

https://projectlombok.org/

<h4>@Data</h4>
This annotation generates all the boilerplate that is normally associated with simple POJOs and beans: getters for all fields, setters for all non-final fields and appropriate toString, equals and hashCode implementations that evlove the field of the class.