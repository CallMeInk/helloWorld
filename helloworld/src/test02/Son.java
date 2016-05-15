package test02;

public class Son extends Father{
	
	private int b;
	
	public Son(){
		super();
		System.out.println("子类无参数构造类");
	}
	
	public Son(int b){
		super();
		this.b = b;
		System.out.println("子类有参数构造类");
	}
	
	public Son(int a,int b){
		super(a);
		this.b = b;
		System.out.println("子类有参数构造类");
	}
	
	public static void main(String[] args) {
		Son son = new Son(1,2);
	}

}
