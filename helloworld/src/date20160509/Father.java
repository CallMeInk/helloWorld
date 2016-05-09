package date20160509;

public class Father {

	private int Age;
	private String Name;

	public Father(){
		System.out.println("father construction with no parameter");
	}
	
	public Father(String name,int age){
		this.Age = age;
		this.Name = name;
		System.out.println("father construction with two parameter");
	}
	
	
	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public void speak(){
		//经测试写Name子类可以运行speak函数而不管Name是private，视屏里写this.getName();
		//这样写应该是方便子类重写父类函数的时候可以用
		System.out.println("My name is "+Name);
		System.out.println("My age is "+Age);
	}
}
