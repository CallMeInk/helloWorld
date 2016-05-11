package number24;

public class Test {

	public static void main(String[] args) {
		Singleton singleTest1 = Singleton.getInstance();
		Singleton singleTest2 = Singleton.getInstance();
		System.out.println(singleTest1==singleTest2);
		
		Singleton2 singleTest3 = Singleton2.getInstance();
		Singleton2 singleTest4 = Singleton2.getInstance();
		System.out.println(singleTest3 == singleTest4);
	}
}
