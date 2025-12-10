package threading;

public class MultythreadingPaert4 {

	public static void main(String[] args) {
		student s1 = new student();

		Thread t1 = new MyThread2(s1, "abhi");
		Thread t2 = new MyThread2(s1, "akshay");
		Thread t3 = new MyThread2(s1, "sunil");

		t1.start();
		t2.start();
		t3.start();

	}
}

class MyThread2 extends Thread {
	private student student;
	private String name;

	public MyThread2(threading.student student, String name) {
		super();
		this.student = student;
		this.name = name;
	}

	@Override
	public void run() {
		student.show(name);
	}

}

class student {
	public synchronized void show(String name) { // method level Synchronize
		System.out.println(Thread.currentThread().getName() + " " + name);
		System.out.println(Thread.currentThread().getName() + " " + name);
		System.out.println(Thread.currentThread().getName() + " " + name);
		System.out.println(Thread.currentThread().getName() + " " + name);
		System.out.println(Thread.currentThread().getName() + " " + name);
	}
}
