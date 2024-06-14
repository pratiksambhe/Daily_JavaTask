package threadimplements;

public class Task implements Runnable{
	@Override
public void run() {
		this.m1();
	
}
	

	void m1() {
		for(int i=0;i<10;i++) {
			System.out.println("m1");
		
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		}
	
		
	}}

