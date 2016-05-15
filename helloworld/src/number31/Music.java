package number31;

public class Music extends Thread{
	
	

	@Override
	public void run(){
		for(int i=1;i<1000;i++){
			try {
				Thread.sleep(50);
				System.out.println("music!!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(this.getName());
	}
	
}
