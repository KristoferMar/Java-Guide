<h1>Java Basics</h1>

<!-- Java Basics -->
<h2>Basics</h2>
<h3>Java For loop</h3>
For loop: <br>
<pre>
  for (int i = 0; i < 5; i++) {
    System.out.println(i);
  }
</pre>
<p>for-each Loop</p>
<pre>
for (type variableName : arrayName) {
  // code block to be executed
}
</pre>
Details: <br>
https://www.w3schools.com/java/java_for_loop.asp


<!-- Java Classes -->
<h2>Java Classes</h2>
<h3>Java List</h3>
It facilities us the option to create an ordered collection. It contains the index-based methods to insert, update, delete and search the elements. It can have the dublicate elements also. We can also store the null element in the list. <br>
Java list inherits the Collection interface, and the implementation classes of List is "ArrayList", "LinkedList", "Stack" and "Vector. <br>
- The Java ListIterator interface can used to traverse the element in a backward and forward direction. <br>
<br>
Example: <br>
https://github.com/KristoferMar/Java-Guide/blob/master/Basics_Java/Java_Classes/List.java 

<h3>Java Iterator</h3>
It's an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping. <br>
- hasNext() and next() are used to loop through a collection <br>
- remove() is used to remove items from collection <br>
<br>
Example: <br>
https://github.com/KristoferMar/Java-Guide/blob/master/Basics_Java/Java_Classes/Iterator.java


<br>
<h2>Operators</h2>
<h4>Double colon (::) operator in Java</h4>
The Double colon (::) operator also known as method reference operator in Java, is used to call a method by refering to it with the help of its class directly.<br><br>
example:<br>
Printing from a foreach-loop win the following way: <br>
<i>stream.forEach( s-> System.out.println(s));</i><br>
Can be done like this:<br>
<i>stream.forEach(System.out::println(s));</i> <br>
<br>
Details: <br>
https://www.geeksforgeeks.org/double-colon-operator-in-java/
