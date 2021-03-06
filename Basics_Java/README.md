<h1>Java Basics</h1>

Playground can be found here:





<h1>Java info</h1>

- Java is a statically typed lanaugage meaning value types needs to be defined

<!-- Java Basics -->
<h2>Basics</h2>

<h3>If...Else</h3>
Java conditions and if statments used to perform different actions<br>
- Less than: a < b <br>
- Less than or equal to: a <= b <br>
- Greater than: a > b <br>
- Greater than or equal to: a >= b <br>
- Equal to: a == b <br>
- Not Equal to: a != b <br>

<br>
Java has the following conditional statements<br>
- Use <i>if</i> to specify a block of code to be executed, if a specified condition is true <br>
- Use <i>else</i> to specify a block of code to be executed, if the same condition is false <br>
- Use <i>else if</i> to specify a new condition to test, if the first condition is false <br>
- Use <i>switch</i> to specify many alternative blocks of code to be executed <br>
<br>

If condition is true this will execute <br>
<pre>
if (condition) {
  // block of code to be executed if the condition is true
}
</pre>

<br>
If, else if, else statement example <br>
<pre>
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
</pre>


<h2>Switch statements</h2>
Link: <br>
https://github.com/KristoferMar/Java-Guide/blob/master/Basics_Java/src/switch_statement/Switch.java 


<br><br>
<h2>Iteration and Datastructure</h2>
- Lists <br>
- Iterable <br>
- ArrayList <br>
- LinkedList <br>
- Map_interface <br>
<br>
<h3>HashMap</h3> 
https://github.com/KristoferMar/Java-Guide/blob/master/Basics_Java/src/data_structures/map_interface/MapHeaders.java <br><br>
- Queinterface <br>
<br>
Link: <br>
https://github.com/KristoferMar/Java-Guide/tree/master/Basics_Java/src/data_structures <br>

<br><br>
<h4>Ternary operator</h4>
We use the ternary operator to create an inline ifstatement. <br>
<pre>
variable = (condition) ? expressionTrue :  expressionFalse;
</pre><br>
Example<br>
<pre>
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);
</pre>





<h3>Java For loop</h3>
Example:
https://github.com/KristoferMar/Java-Guide/blob/master/Basics_Java/src/loops/BasicDemo.java

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
<h3>Java StringBuilder</h3>
It's used to create a mutable (modifiable) string. The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized. <br>
- It's part of the java.lang libraray. <br>
<h4>Methods</h4>
append(String s)             : used to append(add) the specified string with this string. <br>
insert(int offset, String s) : used to insert the specified string with this string at the specified position. <br>

<h3>Java List</h3>
 It facilities us the option to create an ordered collection. It contains the index-based methods to insert, update, delete and search the elements. It can have the dublicate elements also. We can also store the null element in the list. <br>
- Java list inherits the Collection interface, and the implementation classes of List is "ArrayList", "LinkedList", "Stack" and "Vector. <br>
- The Java ListIterator interface can used to traverse the element in a backward and forward direction. <br>
<br>
Example: <br>
https://github.com/KristoferMar/Java-Guide/blob/master/Basics_Java/Java_Classes/List.java 

<br>
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

<br> <br>
<h2>Serializable and Deserializable</h2>
https://github.com/KristoferMar/Java-Guide/tree/master/Basics_Java/src/serializable

<br><br>
<h1>Java Testing</h1>
- An ide such as Eclipse is needed for debugging - it has an implemented debugger which can be used by setting breakpoints in the code and "Run application" in debug mode.

There are multople steps which can be performed when inside the debugger
- Step over (F6) - Steps to next line in debugger
- Step into (F5) - Steps into method of current line
- "Drop to frame" - This step will go back to the beginning of your debugging and variables will not get reinitialised 


<h2>Unit/JUnit testcases</h2>

Unit tests should have a specific naming convension such as
- Test name should express a specific requirement
- Test name could include the expected input or state and the expected result for that input or state
- Test name should be presented as a statement or fact of life that expresses workflows and outputs
- Test name could include the name of the tested method or class

An example of this is the following: <br>
<pre> MethodName_StateUnderTest_ExpectedBehavior </pre>

- Open source, unit testing framework for Java
- Set-up input
- Execute method
- Test expected output against actual 

In the middle of a debug you can highlight a variable and press "ctrl + shift + i" to view the content/value of that variable without having to do print statements everywhere.
