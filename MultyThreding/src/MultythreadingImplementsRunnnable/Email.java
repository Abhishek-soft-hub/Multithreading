package MultythreadingImplementsRunnnable;

public class Email {
	public static void main(String[] args) {
		Runnable r1 = new mythread("the email from India");
		Runnable r2 = new mythread("the email from swiden");
		Runnable r3 = new mythread("the email from japan");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}

class mythread implements Runnable {

	private String msg;

	public mythread(String msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + msg);

	}

}
