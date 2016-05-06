package date20160506;

class Test{
	public int variable;
}

public class Person {
	
	public int id;
	
	void speak(String name,Integer age,String ...hobbies){
		System.out.println("my name is "+name);
		System.out.println("my age is "+age);
		for (String hobby:hobbies){
			System.out.println(hobby+" ");
		}
		System.out.println("I have "+hobbies.length+"hobbies");
		age++;
		name=name+"123";
		System.out.println("test in"+age);
	}
	
	void change(Test test){
		test.variable++;
	}
	
	static void staticTest(){
		System.out.println("This is a static function!!!");
	} 
	
	int calculate(int n){
		if (n==1) return 1;
		else if (n==2) return 1;
		else return calculate(n-1)+calculate(n-2);
	} 
	
	
	/*-----------------------------------*/
	public static void main(String[] args) {
		Integer age=new Integer(2);
		Person person = new Person();
		String name="yukai";
		//string和integer没变，后面的test class变了
		
		person.speak(name,age, "swim","basketball");
		System.out.println("n="+age);
		System.out.println("name ="+name );
		
		Test test = new Test();
		test.variable = 1;
		person.change(test);
		System.out.println(test.variable);

		Person.staticTest();
		
		System.out.println(person.calculate(5));
	}
	
}
