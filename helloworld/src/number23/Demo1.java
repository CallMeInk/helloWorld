package number23;

public class Demo1 {

	public static void main(String[] args) {
		int a=1;
		Integer b = new Integer(a); //装箱
		int c = b.intValue();       //拆箱
		System.out.println(a+" "+b+" "+c);
	}
}
