package thread;

public class Task extends Thread{
	@Override
public void run() {
		this.m1();
	for(int i=0;i<10;i++) {
		System.out.println("Pratik");
	
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
}
	
}
	void m1() {
		System.out.println("m1");
	}
	public static void main(String[] args) throws InterruptedException {
		Task t1=new Task();
		t1.start();
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		t1.setName("Pratik3");
		System.out.println(t1.getName());

		t1.setPriority(10);
		for(int i=0;i<10;i++) {
			System.out.println("Pratik2");
			Thread.sleep(600);	
	}
		
	}
}
