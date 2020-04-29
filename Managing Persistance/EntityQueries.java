

// Named Query
@Entity 
@NamedQuery(name="getAllItems", query="select i from Items i where i.price > :price")
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = GeneratedType.IDENTITY)
    private Long id;
    private double price;
    ...
}

// IN ANOTHER CLASS - where we use the query.
// To Execute query we refer to the entity query name
...
Public List<Item> getItemsWithSpecificPrize( double price) {
    Query query=entityManager.createNamedQuery("getAllItems")
	query.setParameter("price", salary);
	retrun query.getResultList();
}


//  To create more than one named query you have to wrap your named queries in a @NamedQueries
@Entity
@NamedQueries({
	@NamedQuery(name="getAllItems",
		query="select i from Items i where i.price > :price"),
	@NamedQuery(name="getItemsWithPriceOrName",
		query="select i from Items i where i.price > :price or e.itemName=:name")
})
public class Item implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String itemName;
	private double price;
....   