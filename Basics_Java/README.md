<h1>Java Basics</h1>

<h2>Basics</h2>
<h4>Java For loop</h4>
For loop: <br>
```
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
``` 
<br>
<p>for-each Loop</p>
```
for (type variableName : arrayName) {
  // code block to be executed
}
``` 
<br>
Details: <br>
https://www.w3schools.com/java/java_for_loop.asp

<br>
<h3>Operators</h3>
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