package number25;

public class Demo2 {

	public static void test(){
		String str = "123a";
		int a;
		try{
			a = Integer.parseInt(str);
			System.out.println("run try");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("run catch");
			return;
		}finally{
			System.out.println("run final");
		}
		System.out.println("run here");
	}
	
	
	public static void main(String[] args) {
		Demo2.test();
	}
}
