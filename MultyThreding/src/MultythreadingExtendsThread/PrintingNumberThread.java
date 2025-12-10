package MultythreadingExtendsThread;

public class PrintingNumberThread {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			Thread t1 = new numbers(i);
			t1.start();

		}
	}

}

class numbers extends Thread {
	private int numbers;

	public numbers(int numbers) {
		this.numbers = numbers;
	}

	public void run() {
		long startTime = System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName() + "printing numbers" + numbers);
		System.out.println(Thread.currentThread().hashCode() + "printing numbers" + numbers);
		System.out.println(Thread.currentThread().threadId() + "printing numbers" + numbers);
		long endtime = System.currentTimeMillis();
		System.out.println(endtime - startTime + "== time");

	}
}