package number30;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
		hashmap.put(1, "aaa");
		hashmap.put(2, "bbb");
		hashmap.put(3, "ccc");
		hashmap.put(4, "ddd");
		
		String s = hashmap.get(1);
		System.out.println(s);
		
		Iterator it = hashmap.keySet().iterator();
		while(it.hasNext()){
			int i = (int) it.next();
			s = hashmap.get(i);
			System.out.println("key = "+i+" value = "+s);
		}
	}
}
