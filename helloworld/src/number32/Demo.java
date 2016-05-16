package number32;

public class Demo implements Runnable{

	private int i = 200;
	
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		while(i>0){
			synchronized(this){
				try {
					Thread.sleep(100);
					if (i % 3 == 0){
						System.out.println("使用yeild: "+Thread.currentThread().getName()+" "+"i = "+i);
						Thread.currentThread().yield();
					}
					System.out.println(Thread.currentThread().getName()+" i = "+i);
					i--;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		new Thread(demo,"1").start();
		new Thread(demo,"2").start();
		new Thread(demo,"3").start();
		new Thread(demo,"4").start();
		new Thread(demo,"5").start();
		new Thread(demo,"6").start();
		new Thread(demo,"7").start();
		new Thread(demo,"8").start();
		new Thread(demo,"9").start();


	}
	

}
