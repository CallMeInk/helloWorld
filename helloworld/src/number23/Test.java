package number23;

public class Test {
	public void say(A a){
		a.a();
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.say(new B());
		
		//匿名内部类
		
		test.say(new A(){
			public void a(){
				System.out.println("匿名内部类");
			}
		});
				
	}
}
