package threading;

public class MultiThreadingPart2 {
	public static void main(String[] args) {
		printerName p = new printerName();
		Thread t1 = new Mythread(p, "abhi");
		Thread t2 = new Mythread(p, "r");
		Thread t3 = new Mythread(p, "akash");
		Thread t4 = new Mythread(p, "vishal");

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}

class Mythread extends Thread {

	private printerName printer;
	private String name;

	public Mythread(printerName printer, String name) {

		this.printer = printer;
		this.name = name;
	}
	
	@Override
	public void run() {
		printer.show(name);
	}

}  

class printerName {
	public void show(String name) {
		if (name.length() < 2) {
			System.out.println("invalid name ");
		}
		if (name.length() >= 2) {
			synchronized (this) { // Block level Synchronize
				System.out.println(Thread.currentThread().getName() + name);
				System.out.println(Thread.currentThread().getName() + name);
				System.out.println(Thread.currentThread().getName() + name);
				System.out.println(Thread.currentThread().getName() + name);
			}
		}
	}
}