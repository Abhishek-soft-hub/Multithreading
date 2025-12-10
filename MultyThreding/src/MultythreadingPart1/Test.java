package MultythreadingPart1;

public class Test {
	public static void main(String[] args) {
		
		Thread t1 = new Mythread();
		Thread t2 = new Mythread();
		Thread t3 = new Mythread();
		Thread t4 = new Mythread();
		Thread t5 = new Mythread();
		Thread t6 = new Mythread();
		Thread t7 = new Mythread();
		Thread t8 = new Mythread();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		
	}

}


class Mythread extends Thread{
	
	
	public void run() {
		
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("this method is running");
		System.out.println("this method is running");
		System.out.println("this method is running");
		System.out.println("this method is running");
		System.out.println("this method is running");
		
	}
}
