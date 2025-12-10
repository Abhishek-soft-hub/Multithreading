package MultythreadingPart1;

public class demo {

	public static void main(String[] args) {

		

	Thread mt1= new MyThread("email to indian customer");
	Thread mt2= new MyThread("email to us customer");	
	Thread mt3= new MyThread("email to china customer");	
	Thread mt4= new MyThread("email to uk customer");	
	mt1.start();
	mt2.start();
	mt3.start();
	mt4.start();
	
	

	}
}

class MyThread extends Thread {

	private String message;
	public MyThread(String message) {
		this.message = message;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + message);

	}
}

