package ConsumerProducer;

import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Stack s = new Stack<>(); // stack are use for last in , Last out
		Thread consumer = new Consumer(s);
		Thread producer = new Producer(s);
		consumer.start();
		producer.start();

	}
}

class Producer extends Thread {
	private Stack postBox;

	public Producer(Stack postBox) {
		this.postBox = postBox;
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " producing msg");
		System.out.println(postBox.add("hi abhishek"));
	}
}

class Consumer extends Thread {
	private Stack postBox;

	public Consumer(Stack postBox) {

		this.postBox = postBox;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " consuming message");
		System.out.println(postBox.pop());
	}

}
