package ConsumerProducer;

import java.util.Stack;

public class Test2 {

	public static void main(String[] args) {
		Stack s = new Stack();
		Thread t1 = new consumer(s);
		Thread t2 = new producer(s);

		t1.start();
		t2.start();

	}

}

class consumer extends Thread {

	private Stack stack;

	public consumer(Stack stack) {
		this.stack = stack;
	}

	@Override
	public void run() {

		synchronized (stack) {
			System.out.println("consumer thread is started");
			if (stack.isEmpty()) {
				try {
					System.out.println("waiting consumer");
					stack.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(Thread.currentThread().getName() + "consumer threading");
		System.out.println(stack.pop());

	}
}

class producer extends Thread {
	private Stack stack;

	public producer(Stack stack) {
		this.stack = stack;
	}

	@Override
	public void run() {

		synchronized (stack) {
			System.out.println("producer thread is started");
			System.out.println(Thread.currentThread().getName() + "produceing thread");
			stack.add("your letter");
			stack.notify();

		}

	}
}
