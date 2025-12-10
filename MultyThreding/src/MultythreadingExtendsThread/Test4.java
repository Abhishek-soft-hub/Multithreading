package MultythreadingExtendsThread;

public class Test4 {
	public static void main(String[] args) {
		printer p = new printer();
		Thread t1 = new mythread4(p, "pratik");
		Thread t2 = new mythread4(p, "raj");
		Thread t3 = new mythread4(p, "om");
		Thread t4 = new mythread4(p, "Abhi");

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}

class mythread4 extends Thread {
	private printer printer;
	private String name;

	public mythread4(printer printer, String name) {
		super();
		this.printer = printer;
		this.name = name;
	}

	@Override
	public void run() {
		printer.show(name);
	}

}

class  printer {
	public synchronized void show(String name) {
		System.out.println(Thread.currentThread().getName() + name);
		System.out.println(Thread.currentThread().getName() + name);
		System.out.println(Thread.currentThread().getName() + name);
		System.out.println(Thread.currentThread().getName() + name);
	}
}
