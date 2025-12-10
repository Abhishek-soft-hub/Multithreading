package ExecutorService;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThread {
	
	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(8);

		List<String> l = Arrays.asList("abhi@gmail.com", "ravi@gmail.com", "akash@gmail.com", "vishal@gmail.com" , "sneha@gmail", "Srk@gmail.com");
		for(String email : l) {
			Thread t = new MyThread(email);
			ex.submit(t);
		}
	}

}
class MyThread extends Thread{
	
	
	private String email;
	
	
	public MyThread(String email) {
		this.email = email;
	}


	@Override
	public void run() {
	
		System.out.println(Thread.currentThread().getName() + " email = " + email);
	}
	
}
