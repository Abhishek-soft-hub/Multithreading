package MultythreadingExtendsThread;

public class Test5 {
	public static void main(String[] args) {
		printer1 p = new printer1();
		Thread t1 = new mythread5(p, "abhi");
		Thread t2 = new mythread5(p, "pratik");
		Thread t3 = new mythread5(p, "sachin");
		Thread t4 = new mythread5(p, "raju");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}

	class mythread5 extends Thread {
		private printer1 printer;
		private String name;

		public mythread5(printer1 printer, String name) {

			this.printer = printer;
			this.name = name;
		}
		
		@Override
		public void run() {
			printer.setName(name);
			printer.show();
		}
	}

class printer1{
	private String name;
	
	public void show() {
		System.out.println(Thread.currentThread().getName() + name);
		System.out.println(Thread.currentThread().getName() + name);
		System.out.println(Thread.currentThread().getName() + name);
		System.out.println(Thread.currentThread().getName() + name);
		System.out.println(Thread.currentThread().getName() + name);
	}

	public void setName(String name) {
		this.name = name;
	}
	
}