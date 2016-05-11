package number25;

public class Demo3 {

	public static void test() throws NumberFormatException{
		String str = "1123a";
		int a = Integer.parseInt(str);
		System.out.println("we're in test");
	}
	
	public static void main(String[] args) {
		try{
			Demo3.test();
			System.out.println("we're in try");
		}catch(Exception e){
			System.out.println("we're in catch");
		}
		
		System.out.println("we're out");
	}
}
