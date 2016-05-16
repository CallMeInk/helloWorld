package number33;

public class Demo3 implements Runnable{

	private int baoZi=10;
	@Override
	public void run() {
		/*
		 * 同步块
		 */
		synchronized (this) {
			while(baoZi>0){
				System.out.println(Thread.currentThread().getName()+"   "+baoZi);
				baoZi--;
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		Demo3 demo1 = new Demo3();
		//Thread t1 = new Thread(demo1,"1");
		//t1.start();
		new Thread(demo1,"1").start();
		new Thread(demo1,"2").start();
		new Thread(demo1,"3").start();
	}

}
