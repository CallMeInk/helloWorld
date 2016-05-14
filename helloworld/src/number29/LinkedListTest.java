package number29;

import java.util.LinkedList;

public class LinkedListTest {
	
	public static void print(LinkedList<String> list){
		System.out.println("element in list:");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		list.add("fff");
		print(list);
		
		System.out.println(list.indexOf("bbb"));
		print(list);
		
		System.out.println(list.peekFirst());
		print(list);
		
		list.pollFirst();
		print(list);
	}
}
