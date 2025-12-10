package MultythreadingExtendsThread;

public class test2 {
	public static void main(String[] args) {
		ResultNumbers r = new ResultNumbers();
		Thread t1 = new Mythread2(r, 85);
		Thread t2 = new Mythread2(r, 65);
		Thread t3 = new Mythread2(r, 23);
		Thread t4 = new Mythread2(r, 66);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}

class Mythread2 extends Thread {
	private ResultNumbers result;
	private int marks;

	public Mythread2(ResultNumbers result, int marks) {
		this.result = result;
		this.marks = marks;
	}

	@Override
	public void run() {
		result.marks(marks);
	}
}

class ResultNumbers {
	public synchronized void marks(int marks) {
		System.out.println(Thread.currentThread().getName() + "marks : " + marks);
		System.out.println(Thread.currentThread().getName() + "marks : " + marks);
		System.out.println(Thread.currentThread().getName() + "marks : " + marks);
		System.out.println(Thread.currentThread().getName() + "marks : " + marks);
		System.out.println(Thread.currentThread().getName() + "marks : " + marks);
	}
}
