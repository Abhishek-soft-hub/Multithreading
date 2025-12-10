package MultythreadingImplementsRunnnable;

public class Test {
	public static void main(String[] args) {
		mythreads mt = new mythreads();
		mt.show();
		Thread t = new Thread(mt);
		t.start();
	}

}
class Baseclass {
	public void show() {
		System.out.println("this is base class");
	}
}

class mythreads extends Baseclass implements Runnable{

	@Override
	public void run() {
	System.out.println( Thread.currentThread().getName() + "    this is chiled class ");
		
	}
	
}