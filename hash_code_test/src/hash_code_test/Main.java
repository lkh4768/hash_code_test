package hash_code_test;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<Person, String> hashMap = new HashMap<>();
		
		hashMap.put(new Person(0, "lee", 27), "lee");
		
		/* print null */
		System.out.println(hashMap.get(new Person(0, "lee", 27)));
	}
}
