- Signifies abstractness
- Non-instantiable, but defines common protocol(business logic) for subclasses.
- Can't be instansiated 

<pre>
    abstract class Bookmark {
        ...
    }
</pre>


<h2>Abstract method</h2>

- abstract void isKidFriendlyEligible();
- Must be overridden!
    - can't be static

- Abstract class should be extended
- Subclass objects do real work!!
- Abstract method --> Abstract class 
- Abstract class -> {abstract, concrete} methods

<h2>Abstract Subclass</h2>

- Neeed not override abstract methods
- Can override methods
- Can define abstract & concrete methods


<h3>Concrete subclass </h3>

- MUST override unimplemented abstract methods

<br>
<h2>Multiple inheritance</h2>

- Java doesn't support multiple inheritance becuase we can only inherit from one class.
- Therefore the kinds of multiple inheritance issues that exist are solved using interfaces