package MultythreadingExtendsThread;

public class Mythread1 {

	public static void main(String[] args) {

		Thread t1 = new CreckateScore(18 ,2 );
		Thread t2 = new CreckateScore(58 ,5 );
		Thread t3 = new CreckateScore(90 ,7 );
		Thread t4 = new CreckateScore(100 ,8 );
		Thread t5 = new CreckateScore(120 ,11 );
		Thread t6 = new CreckateScore(69, 8);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		
	}

}

class CreckateScore extends Thread {
	private int runs;
	private int overs;

	public CreckateScore(int runs, int overs) {
		this.runs = runs;
		this.overs = overs;

	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + " runs => " + runs);
		System.out.println(Thread.currentThread().getName() + " overs => " + overs);
	}
}
