<h1>What is serialization?</h1>
Serialization is converting e.g an object into byte streams which can be transfered between different machines or internal modules in an efficient and fast way. With serialization we also keep the initial "state" of the objects with all it's original values when we deserialize it.

- transient variables can't be serialized
- Static variables can't be serialized 

It's possible to create a static final long serialCersionUID =<value>; to provide a serialized object with a static ID.
This helps when evolving serializable classes.