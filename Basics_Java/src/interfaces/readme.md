<h1>Interface</h1>

- Interfaces have almost only public abstract methods - You will not see any concrete methods
- Interfaces have No state! (stateless)
- They are non-instantiable
- No constructor 
- It's a pure contract
- Imported like we import classes
- The keyword "implements" is used when implementing an interface
<<<<<<< HEAD
=======
- An interface can extend other interfaces
>>>>>>> c306cdec70153cb7dd265ec6bb0a4e235a5afb78

<br>
<h2>Defining</h2>

- If we dont use "public" the interface is only available within a package
- Can only have default or public
- Can hold static final fields
- Can hold abstract methods
- Interfaces can hold what we find below - Since java 8, interfaces are not only abstract
<pre>
    public interface InterfaceName {
        static final fields;
        abstract methods;
        default methods;
        static methods;
        Nested types;
    }
</pre>

More on interfaces:
- public & abstracy by default
- Variables are publi, static & final by default
- All members are public by default
- Members can't be private & protected

<pre>
    public interface Shareable {
        String getItemData();
    }
</pre>

<h2>Important to know</h2>

- An interface can only be a reference type, never an object type.
- A class can import multiple interfaces