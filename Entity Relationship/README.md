<h1>Entity Relationships</h1>
Entities in java can be represented by and assosiated with data we manage in a database <br>
Therefore we can also mange relationship between entities with the use of the Java.persistence API. <br>

<br>
We make use of the following annotations: <br>

<h4>@OneToOne</h4>
Single value, where one row in table X is related to a single row in table Y.<br>
<h4>@OneToMany</h4>
Multi-valued, where on row in table X can be related to one or many rows in table Y. 
<h4>@ManyToOne</h4>
Multi-valued, where many rows in table X can be related to a single row in table Y.
<h4>@ManyToMany</h4>
Multi-valued, where many rows in table X can be related to one or many rows in table Y.
<h4>@JoinColumn</h4>
Defines the column that JPA uses as the foreign key.<br>

A complex example of how we can create a relation between entities can be found by looking at the four java classes Make, Model, SubModel and Car in this folder. <br>

<h2> Lazy-Loading </h2>
It's not always necessary to get all data related to an entity if the user only is searching for parts of data. Therefore we can make use of lazy-loading to load only parts of data when needed. <br> <br>

We do that by setting fetch to LAZY: "fetch=FetchType.LAZY" <br> <br>

@OneToMany(mappedBy="make", fetch=FetchType.LAZY) <br>
private Set<Model> models; <br>

<h2>Map Many-to-many Relationships</h2>
We map many to many relationships with the "joinTable" command with the use of "joinColumn" & "inverseJoinColumn". <br>
