package number31;

public class ThreadTest extends Thread{

	public ThreadTest(String name){
		super(name);
	}
	
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(50);
				System.out.println("i = "+i+"  "+this.getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest("t1");
		ThreadTest t2 = new ThreadTest("t2");
		t1.start();
		t2.start();
	}
	
}
