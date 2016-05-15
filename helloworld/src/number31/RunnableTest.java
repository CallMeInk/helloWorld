package number31;

public class RunnableTest implements Runnable{

	private String threadName;
	private int k = 0;
	
	public RunnableTest(String name){
		super();
		this.threadName = name;
	}

	
	public synchronized void run(){
		while(k<=20){
			System.out.println("k = "+k+"  "+threadName);
			k++;
		}
	}
	
	public static void main(String[] args) {
		//效果同ThreadTest
		/*RunnableTest t1 = new RunnableTest("t1");
		RunnableTest t2 = new RunnableTest("t2");
		Thread t11 = new Thread(t1);
		Thread t22 = new Thread(t2);
		t11.start();
		t22.start();*/
		
		//共享资源
		RunnableTest t = new RunnableTest("t");
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}
}
