package MultythreadingExtendsThread;

public class Email {
	
	public static void main(String[] args) {
	Thread t1 =  new Mythread("email to us"); // call thread constructor
	Thread t2 =  new Mythread("email to ind");
	Thread t3 =  new Mythread("email to nepal");
	Thread t4 =  new Mythread("email to aus");
	Thread t5 =  new Mythread("email to china");
	
	t1.start(); // register Thread with scheduler
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	
	}

}

class Mythread extends Thread{
	private String msg;

	public Mythread(String msg) {
		super();
		this.msg = msg;
	}
	
	public  void run() {
		System.out.println(Thread.currentThread().getName() + msg); //print thread
	}
	
	
}
