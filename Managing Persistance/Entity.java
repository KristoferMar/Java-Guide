// An example of how an entiy looks is the following

import javax.persistence.Entity;

@Entity
public class Member implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String emailId;

    // Empty constructor - needed for all entities.
    public Member() {}

    public getters and setters for id and emailId;
    ...
}