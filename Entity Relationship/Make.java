@Entity
public class Make {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

    // Mapping models to this entity is done with "make"
	@OneToMany(mappedBy="make")
	private Set<Model> models;
    ...
}