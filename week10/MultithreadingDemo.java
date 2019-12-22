public class MultithreadingDemo {

	private static int i = 0;
	private static int iS = 0;
	private static Object o1 = new Object();
	
	public MultithreadingDemo() {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("i: "+i);
		System.out.println("iS: "+iS);
	}
	
	public static void main(String[] args) {
		new MultithreadingDemo();
	}
	
	public static void increaseSynchronized() {
		synchronized(o1) {
			iS += 1;
		}
	}
	public static void increase() {
		i += 1;
	}
	
}
class Thread1 extends Thread {
	
	public void run()
	{
		for(int i=0; i<10000; i++) {
			MultithreadingDemo.increaseSynchronized();
			MultithreadingDemo.increase();
		}
	}
}
class Thread2 extends Thread {
	
	public void run()
	{
		for(int i=0; i<10000; i++) {
			MultithreadingDemo.increaseSynchronized();
			MultithreadingDemo.increase();
		}
	}
	
}