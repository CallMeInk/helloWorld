package number21;

public class Test {
	public static void doSomething(Animal animal){
		if(animal instanceof Dog){
			((Dog) animal).speak();
		}
		
		if (animal instanceof Cat){
			((Cat) animal).hello();
		}
	}

	public static void main(String[] args) {
		//常规方法
		Dog dog1 = new Dog();
		dog1.say();
		Cat cat1 = new Cat();
		cat1.say();
		cat1.hello();
		
		System.out.println("--------------------------");
		//使用animal指针（引用），这个是安全的向上转型
		Animal animal = new Dog();
		animal.say();
		animal = new Cat();
		//用不了hello方法，子类新添加的method用父类的指针没办法使用
		animal.say();
		
		System.out.println("--------------------------");
		//父类向下转型变成子类指针，子类新定义的方法可以用
		//animal本来被指向cat类，然后强制转换成cat类指针可行，但是转成dog类编译不报错但是运行出错
		Cat cat2 = (Cat) animal;
		cat2.hello();
		
		//出错代码
		//Dog dog2 = (Dog) animal;
		//dog2.say();
		
		System.out.println("--------------------------");
		//instanceof 测试
		Animal testClass = new Dog();
		System.out.println(testClass instanceof Animal);
		System.out.println(testClass instanceof Dog);
		System.out.println(testClass instanceof Cat);
		doSomething(new Cat());
		doSomething(new Dog());
	}
}
