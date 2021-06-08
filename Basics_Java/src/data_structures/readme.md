<h1>Collection interface</h1>

- Collection of objects
- Polymorphically provides maximum generality
- Some allow duplicates while others do not
- Some are ordered while others are not
- AbstractCollection - direct subclass

<pre> 
public interface Collection<E> extends Iterable<E> {
    // Basic operations
    // Bulk operations
    // Array oprerations
}
</pre>

<br><br>
<h1>List interface</h1>

- Useful when sequence/positioning matters
- Models resizable linear array with indexed access
- Zero-based
- Can have duplicates

<pre>
public interface List<E> extends Collection<E> {
    // Positional
    // Search
    // Iteration
    // Range-view
}
</pre>