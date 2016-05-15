package number31;

public class Demo {

	public static void main(String[] args) {
		Music musicThread = new Music();
		Eat eatThread = new Eat();
		
		musicThread.start();
		eatThread.start();
	}
}
