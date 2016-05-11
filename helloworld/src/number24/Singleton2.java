package number24;

public class Singleton2 {

	private Singleton2(){};
	
	public static Singleton2 single;
	
	
	//懒汉式单例实现，只在使用时才实例化
	public synchronized static Singleton2 getInstance(){
		if (single == null){
			single = new Singleton2();
			System.out.println("实例化");
		}
		return single;
	}
}
