package CollableInterface;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class test2 {
//Calculate Square of a Number
	public static void main(String[] args) throws InterruptedException, ExecutionException {

//		ExecutorService ex = Executors.newFixedThreadPool(2);
//		Callable<Integer> c1 = new Square(2);
//		Callable<Integer> c2 = new Square(3);
//		Callable<Integer> c3 = new Square(5);
//		Callable<Integer> c4 = new Square(7);
//		Future<Integer> future1 = ex.submit(c1);
//		Future<Integer> future2 = ex.submit(c2);
//		Future<Integer> future3 = ex.submit(c3);
//		Future<Integer> future4 = ex.submit(c4);
		
		
		ExecutorService ex = Executors.newFixedThreadPool(2);
		List<Integer> li = Arrays.asList(2, 3, 5, 6, 8);
		for (int sq : li) {
			Callable<Integer> c = new Square(sq);
			Future<Integer> f = ex.submit(c);
			System.out.println(f.get());
		}

	

	}
}

class Square implements Callable<Integer> {

	private int number;

	public Square(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {

		return number * number;
	}

}
