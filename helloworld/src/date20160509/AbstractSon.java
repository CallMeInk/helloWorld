package date20160509;

public class AbstractSon extends AbstractFather{

	@Override
	//@override告诉编译器你在重写父类的方法，如果父类中没有这个speak，编译会报错
	public void speak() {
		System.out.println("My name is "+this.getName());
	}

	public static void main(String[] args) {
		AbstractSon test = new AbstractSon();
		test.speak();
	}
}
