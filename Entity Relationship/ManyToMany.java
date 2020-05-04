// Format for how to map many tom any relationships together.
@JoinTable( 															// Secify the join-table to use when populating the relationship with the @JoinTable annotation
	name="$JOIN_TABLE_NAME",											// Set the name attribute to the table name of the join-table.
	joinColumns=@JoinColumn(name="$JOIN_TABLE_COLUMN_NAME"),			// @JoinColumn to use to join the join.table back to the Student table in this case studentID
	inverseJoinColumns=@JoinColumn(name="$JOIN_TABLE_COLUMN2_NAME")) 	// @JoinColumn to use to join the join-table back to the related Class table. 
private Set<RelatedEntity> entities;