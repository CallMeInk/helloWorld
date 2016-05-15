package number30;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {

	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<Student>();
		list.add(new Student("aaa",1));
		list.add(new Student("bbb",2));
		list.add(new Student("ccc",3));
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			Student s =it.next();
			System.out.println(s.getName()+" "+s.getAge());
		}
		
		for(Student ss:list){
			System.out.println(ss.getName()+" "+ss.getAge());
		}
		
	}
}
