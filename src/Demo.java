public class Demo extends Thread{
	public static void main(String[] args) throws InterruptedException {
		System.out.println("A");
		Demo d = new Demo();
		d.start();
		System.out.println("B");
		d.join();
		System.out.println("C");
	}
	
	public void run() {
		System.out.println("D");
		System.out.println("E");
	}
}

