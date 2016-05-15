package test02;

public class Father {

	private int a;
	
	public Father(){
		System.out.println("父类无参数构造方法");
	}
	
	public Father(int a){
		this.a = a;
		System.out.println("父类有参数构造类");
	}
}
