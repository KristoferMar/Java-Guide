<h1>Polymorphism</h1>

Class defines contract --> "I have these kinds of methods.." <br><br>

Supertype defines common protocol --> "Myself & my subtypes have these kinds of methods..." <br><br>

Supertype = subtypes <br> <br>

<h2>Explaination</h2>
- Reference type & actual object type can be different due to inheritance. <br>
<pre> User user = new Editor(); </pre> <br>

- Compiler uses reference type to decide whether a method can be invoked <br>
<pre>
	User user = new Editor();
	user.approveReview(); //Compiler error
</pre>

<br>
<h2>Method overwriting</h2>
Example: <br>

link

<br><br>
- Redefine behavior of superclass method <br>
	- Add new behavior <br>
	- Extend behavior <br>
	- Providing better implementation, E.g,m override bad code (3 party code rewrite) <br>
	
- Supertype define cotnract & common protocol so with method overriding we need to agree to fulfull the contract <br>

<h3>The two rules</h3>
Rule 1: Same parameters + compatible return types <br>
- Return type must be same or subclass type <br>
- Incompatible return type will lead to compile error <br><br>
Rele 2: Can't be less accessable <br>
- Access level must be same or friendlier <br>

<h3>Super keyword</h3>
- Access superclass method <br>
	- Non-overridden --> direct or super <br>
	- Overridden --> super <br>
	
<pre>
	Class Staff extends User {
		void postAReview() {
			super.postAReview();
			// behavior extension code
		}
	}
</pre>

- Cant be used in static method <br>
- Access hidden field <br>

<br>
<h1>Method Binding</h1>
- Binding a method call to - method decleration and its implementation. <br>

<br>
<h2>Method signature binding </h2>
- Compiler checks if reference type has compatible method <br>
- Writes method signature details into bytecode <br>
- Applies to both instance & static method <br>

<br>
<h1>What is not overridden?</h1>
- Final methods <br>
	- final return Type methodName() {} <br>
- Fields --> Instance & Static <br>
- Static methods <br>

<br>
<h1>Object class</h1>
- Java.lang.Object is the mother of all classes, i.e., superclass of everything. <br>
- The purpose is that it Act as polymorphic type <br>
- It includes core methods <br>

<br>
<h2>Core Methods</h2>

- toString()
	- Returns a string representation of object 
	- Item10: Always override toString
		- Very useful for debugging
		- Return all interesting information

- hashCode()
	- Return object's hashcode (memory address in hexadecimal)
	- Used in hash tables

- equeals (Object)
	- Tests object equality
	- Defualt: Uses == operator

- getClass()
	- final method that returns Class object
	- Class object --> class name, superclass name, method names, ...

- clone()
	- Protected method that returns a copy of this object

<br>
<h1>Constructor chaining</h1>

- Inherited methods might depend on superclass state
- Super classes must be initialized first
- Constructors initialize object state

super keyword
- Invokes superclass constructor, e.g., super()
- Must be first statement unless this() is used
- this() or super(), but never both
- With overloaded constructors, last invoked will call super
- If not provided, compiler inserts super()
- Superclass constructor can't be invoked --> Compile error 