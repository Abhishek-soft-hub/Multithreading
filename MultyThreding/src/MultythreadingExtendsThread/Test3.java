package MultythreadingExtendsThread;

public class Test3 {

	public static void main(String[] args) {
		ResultName result = new ResultName();
		Thread t1 = new myThread3(result, "abhi");
		Thread t2 = new myThread3(result, "raj");
		Thread t3 = new myThread3(result, "ashok");
		Thread t4 = new myThread3(result, "sahil");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

}
}

class myThread3 extends Thread {

	private ResultName result;
	private String name;

	public myThread3(ResultName result, String name) {

		this.result = result;
		this.name = name;
	}
	
	@Override
	public void run() {
		result.printName(name);
	}

}

class ResultName {
	public synchronized void printName(String name) {
		System.out.println(Thread.currentThread().getName() + name);
	}
}
