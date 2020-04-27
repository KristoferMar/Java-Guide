<h1>Managing Persistance</h1>

<h2>JPA Annotations</h2>

<h4>@Entity</h4>
- Is a pojo which has data which is actually goint to persit it to the database.
- Database table name and class name needs to be the same -> else you have to use the annotation below:

<h4>@Table</h4>
- Used to Map a class to a table in database.

<h4>@Column</h4>
- Maps the field name and the column name in the database.

<h4>@Transiant</h4>
- Used to mark fields which are NOT going to be persitent to the database.

<h4>@Id</h4>
- Used to specifiy which field in you entity represents the primary key column in the database. <br>
- Your id must be some type of mutable type and there are 4 types to do that. <br>
    - @GeneratedValue(GenerationType.AUTO) --> Default strategy. <br>
    - @GeneratedValue(GenerationType.SEQUENCE) <br>
    - @GeneratedValue(GenerationType.IDENTITY) --> uses the database identity column. <br>
    - @GeneratedValue(GenerationType.TABLE) --> Here you pull a number of items from the database to generate your value. <br>

<br>
<h2>Entity Manager</h2>
- The Entity Manger handles all our CRUD opperations.
- The entity mangager can be created in the following ways but it's easiest to creat it thorugh CDI:

- We use the netity manger on entities.

<h3>entityManger methods</h3>
...

<br>
<h2>Annotating classes to validate beans</h2>
Package used:
javax.validation.constraints

Annotations assosiated with bean validation.<br>

<h4>@NotNull</h4>
- Verifies that value in field or property is not null

<h3>@Null</h3>
- Verifies that the value is null

<h3>@Size</h3>
- Verifies that the size of the field is between min and max including boundary values

<h3>@Min</h3>
- Verifies the value is higher or equal to the minimum value set.

<h3>@Max</h3>
- Verifies the value is less then or equal to the maximum accepted value.

<h3>@Digists</h3>
- Verifies the precision and scale of the field.
- Example: <br>
@Digits(integer=7, fraction,2) <br>
private double monthlySale;

<h3>@DecimalMin</h3>
- Verifies that the decimal value is geather than or equal to the value defined in the DecimalMin. (Takes a string)

<h3>@DecimalMax</h3>
- Verifies that the decimal value is kess than or equal to the value defined in the decimalMax. (takes a string)

<h3>@Future</h3>
- Verifies it is a date in the future.
<h3>@Past</h3>
- Verifies it is a date in the past.

<h3>@Pattern</h3>
- Lets us insert regular expressions to take in only a phone number for example.

<h3>@AssertFalse</h3>
- Verifies that our incoming value is false.

<h3>@AssertTrue</h3>
- Verifies that our incoming value is true.

<br>
<h1>Creating Queries</h1>

JPQL = Java Persistence Querry language.
