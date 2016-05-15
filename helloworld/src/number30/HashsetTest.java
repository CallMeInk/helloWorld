package number30;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetTest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("1");
		hs.add("2");
		hs.add("3");
		hs.add("4");
		hs.add("5");
		hs.add("6");
		hs.add("3");

		
		int total=0;
		Iterator<String> it = hs.iterator();
		
		while (it.hasNext()){
			total++;
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		System.out.println("total = "+total);
		
	}
}
