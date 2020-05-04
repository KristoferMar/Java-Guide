@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    // Many cars kan be made but only one make at a time.
	@ManyToOne
	@JoinColumn(name="makeID")
	private Make make;

    // Many models can be made but only one model at a time.
	@ManyToOne
	@JoinColumn(name="modelID")
	private Model model;

    // Many submodels can be made but only oone at a time.
	@ManyToOne
	@JoinColumn(name="subModelID")
	private SubModel subModel;

	private Long year;
}