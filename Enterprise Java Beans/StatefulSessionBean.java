// Statefull session bean
@Stateful
@Named("hello")
public class Hello {

	private String name;

	@Inject
	private PersonService personService;

	public void sayHello() throws IllegalStateException, SecurityException, SystemException {
		String response = personService.hello(name);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(response));
	}

	public String getName() {                                                                   // Statefull beans have getters
		return name;
	}

	public void setName(String name) {                                                          // Stateful brans have setters
		this.name = name;   
	}

}