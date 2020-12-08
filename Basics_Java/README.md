<h1>Java Basics</h1>

<h3>Operators</h3>
<h4>Double colon (::) operator in Java</h4>
The Double colon (::) operator also known as method reference operator in Java, is used to call a method by refering to it with the help of its class directly.<br>
example:<br>
Printing from a foreach-loop win the following way: <br>
<i>stream.forEach( s-> System.out.println(s));</i><br>
Can be done like this:<br>
<i>stream.forEach(System.out::println(s));</i> <br>


Details: <br>
https://www.geeksforgeeks.org/double-colon-operator-in-java/