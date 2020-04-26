// Old school way
@Stateless
public class ItemService {
    // ItemPU is the name of the persistence unit
    EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("ItemPU");
    EntityManager em = emFactory.createEntityManager();
    ...
}

// Entity manger created with Context Dependency Injection CDI.
// We can then @Inject the EntityManager in all other classes in the application.
public class EMProducer {
    @Produces
    @PersistenceContext(unitName= "ItemPU")
    private EntityManager em;
}
