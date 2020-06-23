/**
    Example of how Security RESTEasy Annotations are applied.
 */
@Stateless
@Path("hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorld {

  @PermitAll
  @GET
  @Produces("text/html")
  public String hello() {
     return "<b>Hello World!</b>";
  }

  @RolesAllowed("admin, guest")
  @GET
  @Path("newest")
  public Person getNewestPerson() {
    ...implementation omitted...
  }

  @RolesAllowed({"admin"})
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public String savePerson(Person person) {
     ...implementation omitted...
  }

  @DenyAll
  @DELETE
  public String deleteAll() {
    ...implementation omitted...
  }
}