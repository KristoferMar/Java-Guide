package data_structures.map_interface;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	
	private static void hashMapDemo() {
		System.out.println("\n\nInside hashMapDemo ...");
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("John", 25);
		map1.put("Raj", 29);
		map1.put("Anita", null);
		
		System.out.println(map1);
		
		map1.put("Anita", 23);
		System.out.println(map1);
		
		System.out.println("Contains John? " + map1.containsKey("John"));
		System.out.println("John's age: " + map1.get("John"));
		
		System.out.println("Iterating using keySet ...");
		Set<String> names = map1.keySet();
		for (String name : names) {
			System.out.println("Name: " + name + ", Age: " + map1.get(name));
		}
		
		System.out.println("Iterating using entrySet ...");
		Set<Map.Entry<String, Integer>> mappings = map1.entrySet();
		for (Map.Entry<String, Integer> mapping : mappings) {
			System.out.println("Name: " + mapping.getKey() + ", Age: " + mapping.getValue());
		}
		
		names.remove("Anita");
		System.out.println(map1);
		
		Map<String, Map<String, Object>> userProfile = new HashMap<>();
		
		Map<String, Object> profile = new HashMap<>();
		profile.put("age", 25);
		profile.put("dept", "CS");
		profile.put("city", "New York");
		
		userProfile.put("John", profile);
		
		profile = new HashMap<>();
		profile.put("age", 29);
		profile.put("dept", "CS");
		profile.put("city", "New York");
		
		userProfile.put("Raj", profile);
		
		System.out.println("userProfile: " + userProfile);
		
		Map<String, Object> profile1 = userProfile.get("John");
		int age = (Integer) profile1.get("age");
		System.out.println("Age: " + age);
		// Exercise: Try using second constructor, putAll, clear, values, and other methods
	}
		
	public static void main(String[] args) {
		hashMapDemo();		
	}	
}
