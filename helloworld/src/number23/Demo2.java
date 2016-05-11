package number23;

public class Demo2 {

	public static void main(String[] args) {
		Integer i = 1; //自动的装箱
		int j = i;     //自动的拆箱
		System.out.println(i+" "+j);
		
		String s1 = "123";
		String s2 = "456";
		int m,n;
		m = Integer.parseInt(s1);
		n = Integer.parseInt(s2);
		System.out.println(m+n);
		
	}
}
