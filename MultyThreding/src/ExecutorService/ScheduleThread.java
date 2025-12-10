package ExecutorService;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleThread {
	
	public static void main(String[] args) {
		
		
		ScheduledExecutorService ex = Executors.newScheduledThreadPool(4);
		List<String > list = Arrays.asList("abhi@gmail.com", "ravi@gmail.com", "akash@gmail.com", "vishal@gmail.com", "rohit@gmail.com",
				"sunil@gmail.com", "amit@gmail.com");
		for(String email : list) {
			Thread t =new gmail(email);
//			ex.scheduleAtFixedRate(t, 2, 2, TimeUnit.SECONDS);
			ex.scheduleAtFixedRate(t,3 , 2, TimeUnit.SECONDS);
		}
	}

}
class gmail extends Thread{
	private String msg;

	public gmail(String msg) {
		super();
		this.msg = msg;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + msg);
	}
}
