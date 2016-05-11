package number24;

public class Singleton {

	//构造方法私有化，只能在类的内部进行构造
	private Singleton(){};
	
	//提供一个public的接口
	//*饿汉式* *单例* 实现
	public  static final Singleton single = new Singleton();
	
	//提供一个得到实例的方式，但是每个实例都一样
	public static Singleton getInstance(){
		return single;
	}
	
	
	
}
