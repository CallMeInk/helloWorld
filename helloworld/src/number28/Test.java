package number28;

public class Test {

	public static void main(String[] args) {
		C c1 = new C(1);
		c1.print();
		int i1 = (int)c1.getObject();
		System.out.println(i1);
		
		C c2 = new C("HelloWorld");
		c2.print();
		String s1 = (String)c2.getObject();
		System.out.println(s1);
		
		//
		System.out.println("------------------------------");
		
		CC<Integer> c3 = new CC<Integer>(1); 
		c3.print();
		int i3 = c3.getT();
		System.out.println(i3);
	}
}
