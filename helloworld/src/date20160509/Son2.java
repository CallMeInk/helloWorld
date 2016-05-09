package date20160509;

public class Son2 extends Father{
	
	private String address;
	
	public Son2(){
		//super();
		System.out.println("son2 construction with no parameter");
	}
	
	public Son2(String name,int age,String address){
		//super(name,age);
		this.setName(name);
		this.setAge(age);
		this.address = address;
		System.out.println("son2 construction with three parameters");
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void speak(){
		System.out.println("I'm son2.Ha Ha!!!!!");
		System.out.println("My name is "+this.getName());
		System.out.println("My age is "+this.getAge());
		System.out.println("My address is "+this.getAddress());
	}
	
	public static void main(String[] args) {
		Son2 son2 = new Son2();
		son2.setAge(19);
		son2.setName("jibakun");
		son2.setAddress("324");
		son2.speak();
		
		Son2 test = new Son2("jibahao",20,"324");
		test.speak();
	}
}
