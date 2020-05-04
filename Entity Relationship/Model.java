@Entity
public class Model {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

    // We realte model and make together by makeID
	@ManyToOne
	@JoinColumn(name="makeID")
	private Make make;

	@OneToMany(mappedBy="model")
	private Set<SubModels> submodels;
    ...
}