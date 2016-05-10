package date20160510;
/**
 * 
 * @author ink
 *
 */
//类只能单继承，接口可以实现多个
public class Test extends C implements D {

	@Override
	public void a() {
		System.out.println("this is method a");
	}
	
	@Override
	public void b() {
		System.out.println("this is method b");
	}

	@Override
	public void d() {
		System.out.println("this is method d");
		
	}
	
	
	public static void main(String[] args) {
		Test test = new Test();
		test.a();
		test.b();
		test.c();
		test.d();
		System.out.println(test.constString);
		System.out.println(A.constString);
		System.out.println(test.constStringB);
		System.out.println(B.constStringB);
	}



}
