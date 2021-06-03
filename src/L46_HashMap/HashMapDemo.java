package L46_HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		// put
		map.put("India", 10);
		map.put("UK", 20);
		map.put("US", 3);
		map.put("Aus", 2);

		System.out.println(map);

		// get
		System.out.println(map.get("India"));

		// containsKey
		System.out.println(map.containsKey("US"));

		// remove
		System.out.println(map.remove("US"));
		System.out.println(map);

		// print
		System.out.println(map.keySet());
        
		// way 1
		Set<String> keys = map.keySet();

		for (String key : keys) {
			System.out.println(key);
		}
		
		// way 2

	}

}
