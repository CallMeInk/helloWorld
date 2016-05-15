package number31;

public class Eat extends Thread{

	
	
	@Override
	public void run() {
		for(int i=1;i<1000;i++){
			try {
				Thread.sleep(50);
				System.out.println("eating!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
