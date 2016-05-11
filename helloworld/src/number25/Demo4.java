package number25;

public class Demo4 {

	public static void test(int a) throws Exception{
		if (a == 1){
			throw new Exception("wrong here!!!");
		}
		System.out.println("we're in test");
	}
	
	public static void main(String[] args) {
		try {
			Demo4.test(1);
			System.out.println("123");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		try {
			Demo4.test(0);
			System.out.println("234");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
