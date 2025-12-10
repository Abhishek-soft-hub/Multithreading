package ExecutorService;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import MultythreadingExtendsThread.Mythread1;

public class SingleThread {

	public static void main(String[] args) {

		ExecutorService ex = Executors.newSingleThreadExecutor();
		List<String> li = Arrays.asList("abhi@gmail.com", "ravi@gmail.com", "akash@gmail.com", "vishal@gmail.com", "abhi@gmail.com", "ravi@gmail.com", "akash@gmail.com", "vishal@gmail.com");
		for(String email : li) {
			Thread t = new message(email);
			ex.submit(t);
		}
		}
}

class message extends Thread {

	private String msg;

	public message(String msg) {

		this.msg = msg;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + msg);
	}
}
