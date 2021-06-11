- It has a list of elements where the elements are linked
- Each element is called a note with data and a pointer to the next node.
    - The first node is called "head". 
- Allows duplicates & nulls

Example on linked list
<pre>
class LinkedList {
    Node head = new Node()
    void add(int data) {
        Node new Node = new Node(data);
        newNode.next = head.next;
        head.next = newNode;
    }
}
</pre>

Typical uses
- frequent add/remove during iteration
    - Better for removeAll() & retainAll()
- Get, add, remove, indexOf and lastIndex are all methods running in O(n) time.


Usage:
<pre>
List<Integer> list1 = new LinkedList<>();
</pre>