package number28b;

public class Test {

	public static void take(Demo<?> dog){
		dog.print();
	}
	
	public static <T> void func(T t){
		System.out.println("type is:"+t.getClass().getName());
	}
	
	
	public static void main(String[] args) {
		Demo<Dog> dog = new Demo<Dog>(new Dog()); 
		dog.print();
		
		Demo<Cat> cat = new Demo<Cat>(new Cat());
		cat.print();
		
		Demo<Animal> animal = new Demo<Animal>(new Animal());
		animal.print();
		
		//Demo<Integer> inttest = new Demo<Integer>();这条报错
		
		System.out.println("------------------------------");
		
		Test.take(dog);
		take(cat);
		
		System.out.println("------------------------------");
		
		func("abc");
		func(1);
		func(2.0);
		func(2.0f);
		func(new Object());
	}
	
}
