- Useful when manipulating head & tail
- Tail -> add
  head -> remove/retrive

- Models FIFO (First in First out)
- Can contain duplicates
- Can have nulls, but generally not supported
    - Dont insert nulls even if possible! 
- No indexed access

<h1>Deque</h1>

- Extends Queue
- Models FIFO & LIFO
- Deque implementstions 
    - ArrayDeque
    - LinkedList
    - ConcurrentLinkedDeque
    - LinkedBlockingDeque