package threading;

public class MultythredingPart3 {
	public static void main(String[] args) {

		employee emp = new employee();
		Thread t1 = new MyThread("abhishek", emp);
		Thread t2 = new MyThread("akash", emp);
		Thread t3 = new MyThread("vishal", emp);
		Thread t4 = new MyThread("raju", emp);
		Thread t5 = new MyThread("rohit", emp);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}

class MyThread extends Thread {

	private String name;
	private employee emp;

	public MyThread(String name, employee emp) {
		super();
		this.name = name;
		this.emp = emp;
	}

	@Override
	public void run() {

		emp.setName(name);
		emp.show();
	}

}

class employee {
	private String name;

	public synchronized void show() {
		System.out.println(Thread.currentThread().getName() + " " + name);
		System.out.println(Thread.currentThread().getName() + " " + name);
		System.out.println(Thread.currentThread().getName() + " " + name);
		System.out.println(Thread.currentThread().getName() + " " + name);
		System.out.println(Thread.currentThread().getName() + " " + name);

	}

	public void setName(String name) {
		this.name = name;
	}

}
