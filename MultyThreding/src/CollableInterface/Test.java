package CollableInterface;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Callable<String> c = new message();
		ExecutorService ex = Executors.newFixedThreadPool(2);
		Future<String> future = ex.submit(c);
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		String str = future.get();
		System.out.println(str);
	}

}

class message implements Callable<String> {

	@Override
	public String call() throws Exception {

		return Thread.currentThread().getName() + " This msg is deliverd to abhishek";
	}

}
