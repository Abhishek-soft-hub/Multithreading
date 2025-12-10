package JointYeildMethod;

public class test {
	public static void main(String[] args) throws InterruptedException {
	
		
		Thread t0 = new mythread();
		Thread t1 = new mythread();
		
		t0.start();
		t1.start();
		t1.join();
		
		System.out.println(Thread.currentThread().getName() + "  this is main thread");
	}

}

class mythread extends Thread{
	
	@Override
	public void run() {
		//Thread.yield();
		System.out.println(Thread.currentThread().getName() + "  this is thread");
	}
	
}
