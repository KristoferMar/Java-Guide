<h1>Inheritance</h1>
- Detailed inheritance can be found in the inehritance src folder. <br>

Duplice code --> maintenance nightmare

Subclass <-- Superclass + Subcæass capabilities


Super class --> supertype or base class
Subclass --> subtype or derived class

<h2>Info</h2>
- We use the keyword "extends" to make a subclass inherit from a superclass.
- A class can only extend from one class

<h2>Access modifiers</h2>
- private --> motifier cant be inharinted <br>
- Default --> Inerited if from family - Only family can access inherited memebers <br>
- Public  --> Are inherited - Anyone can access inherited members <br>
- Protected --> Inherited - Allow access to my family memebers. <br>

<h2>IS-A Test</h2>
- It's important to not create unnessesary inheritance and that's why it's important to test. <br>
- It's important to read the following out loud to make sure relations are correct. <br>
- Staff IS-A User <br>
- Editor IS-A Staff <br>
- Editor IS-A User <br>
- CheifEditor IS-A User <br>
- Surgeon IS-A Doctor <br>
- Triangle IS-A Shape <br>

- If the IS-A test is failing it defently means that we must not use inheritance. <br>

<h3>HAS-A Test</h3>
- The "HAS-A" test detects if we need to use "composition" instead of inheritance meaning that a class should be used as a "field" variable in stead of an inheritance implementation. <br><br>

- Bookmark IS-A Review --> Nope <br>
- Review IS-A Bookmark --> Nope <br>
- Bookmark HAS-A Review --> Yep <br>
- Bathroom IS-A Tub --> Nope <br>
- Tub IS-A Bathroom --> Nope <br>
- Bathroom HAS-A Tub --> Yep <br>

<h2>Cons about inheritance</h2>
- The code can become very abstract which will make it harder to read.

<h1>Prevent inharitance</h1>

- Make all methods as final
- Class sematics (invariants) is final, e.g., String

- Mark class as final
    - Not extendabible, but instantiable, e.g., String class
- Create private constructor
    - Not extndable, not instantiable
    - E.g., Utility classes like Math
    - Saves heap space
    - Cannt be invoked from subclass
        - No constructor chaning -> no subclass --> no inheritance

