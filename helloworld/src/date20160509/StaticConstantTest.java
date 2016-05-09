package date20160509;

public class StaticConstantTest extends StaticConstant{

	public void speak(){
		System.out.println(StaticConstant.Common);
	}
	
	public static void main(String[] args) {
		StaticConstantTest test = new StaticConstantTest();
		test.speak();
	}
}
