package test01;

public class Person {
	String name;
	int age;
	
	public void speak(){
		System.out.println("my name is "+name+".And my age is "+age);
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.age = 20;
		person.name = "yukai";
		person.speak();
	}
}
