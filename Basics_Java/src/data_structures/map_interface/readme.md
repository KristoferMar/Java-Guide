- God for fast lookup by key e.g, data cache
- Also called associative array
- No duplicate keys, duplcate values are fine
- 1 key -> 1 value
- null key & null values - impl. dependent
- AbstractMap

<h1>Hashmap</h1>

- HashMap is also part of this section and can be found un the MapDemo.java


Example:

<pre>
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    
   	// Add keys and values (Country, City)
   	capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
</pre>