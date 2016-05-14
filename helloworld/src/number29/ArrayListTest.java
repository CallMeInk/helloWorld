package number29;

import java.util.ArrayList;

public class ArrayListTest {

	public static void print(ArrayList<String> list){
		System.out.println("element in the list:");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		print(list);
		
		list.add(1, "xxx");
		print(list);
		
		list.set(2, "yyy");
		print(list);
		
		list.remove("xxx");
		print(list);
		
		list.remove(1);
		print(list);
	}
}
