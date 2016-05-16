package number33;

public class Demo1 implements Runnable{

	private int baoZi=10;
	@Override
	public void run() {
		while(baoZi>0){
			System.out.println(Thread.currentThread().getName()+"   "+baoZi);
			baoZi--;
		}
	}
	
	
	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
		//Thread t1 = new Thread(demo1,"1");
		//t1.start();
		new Thread(demo1,"1").start();
		new Thread(demo1,"2").start();
		new Thread(demo1,"3").start();
	}

}
