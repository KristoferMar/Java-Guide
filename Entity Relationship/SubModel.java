@Entity
public class SubModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

    // Many submodels are created for one model.
	@ManyToOne
	@JoinColumn(name="modelID")
	private Model model;
}