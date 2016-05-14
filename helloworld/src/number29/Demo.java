package number29;

import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<Student>();
		
		Student s1 = new Student("a",1);
		Student s2 = new Student("b",2);
		Student s3 = new Student("c",3);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(int i=0;i<list.size();i++){
			Student s =list.get(i);
			System.out.println(s.getName()+"  "+s.getAge());
		}
		
	}
}
