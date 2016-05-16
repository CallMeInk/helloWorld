package number33;

public class Demo2 implements Runnable{

	private int baoZi=10;
	@Override
	//加synchronized关键字，run方法只能有一个线程进入
	public synchronized void run() {
		while(baoZi>0){
			System.out.println(Thread.currentThread().getName()+"   "+baoZi);
			baoZi--;
		}
	}
	
	
	public static void main(String[] args) {
		Demo2 demo1 = new Demo2();
		//Thread t1 = new Thread(demo1,"1");
		//t1.start();
		new Thread(demo1,"1").start();
		new Thread(demo1,"2").start();
		new Thread(demo1,"3").start();
	}

}
