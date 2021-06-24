<h1>Enums</h1>
- Not extendible
- Not instantiable 

- It is simply a class with a fixed set of constants
- It contains full-blown objects
- Constants -> static & finals
- Same naming conventions as constants
- Elements, members or enumerators of type

<h1>Associating State & Behavior</h1>

- Can have instance variables
- Can have methods 
- Can have constructors with private access
    - No public or protected modifiers
    - No access modifier -> private (not default!)
- Enums can define static members explicitly

<h1>Nested enums</h1>

- Enums can be nested within other enums
- Enums can be nested within static member classes 
- It's imposible to define enums in inner classes

<h2>The important rule</h2>

Item 30: Use enums instead of int constants