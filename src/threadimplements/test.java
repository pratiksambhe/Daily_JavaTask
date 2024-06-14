package threadimplements;

public class test {
public static void main(String[] args) throws InterruptedException {
	Task obj1=new Task();
	Thread t1=new Thread(obj1);
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
	
}}
