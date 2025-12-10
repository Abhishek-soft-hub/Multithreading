package ExecutorService;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChacheThread {

	public static void main(String[] args) {

		ExecutorService ex = Executors.newCachedThreadPool();
		List<String> li = Arrays.asList("abhi@gmail.com", "ravi@gmail.com", "akash@gmail.com", "vishal@gmail.com", "rohit@gmail.com",
				"sunil@gmail.com", "amit@gmail.com", "deepak@gmail.com", "rahul@gmail.com", "manish@gmail.com",
				"raj@gmail.com", "anil@gmail.com", "sanjay@gmail.com", "pankaj@gmail.com", "nilesh@gmail.com",
				"vikas@gmail.com", "arjun@gmail.com", "pradeep@gmail.com", "mohit@gmail.com", "suresh@gmail.com",
				"ashok@gmail.com", "kaushal@gmail.com", "chetan@gmail.com", "girish@gmail.com", "neeraj@gmail.com",
				"lokesh@gmail.com", "tarun@gmail.com", "mayur@gmail.com", "harish@gmail.com", "kiran@gmail.com",
				"vijay@gmail.com", "yash@gmail.com", "rajesh@gmail.com", "anup@gmail.com", "bhavesh@gmail.com",
				"chandan@gmail.com", "divyesh@gmail.com", "gaurav@gmail.com", "hitesh@gmail.com", "jay@gmail.com",
				"kanishk@gmail.com", "lokanath@gmail.com", "mihir@gmail.com", "nitin@gmail.com", "om@gmail.com",
				"parth@gmail.com", "qasim@gmail.com", "rohan@gmail.com", "sachin@gmail.com", "tejas@gmail.com",
				"umar@gmail.com", "vimal@gmail.com", "waseem@gmail.com", "xavier@gmail.com", "yogesh@gmail.com",
				"zeeshan@gmail.com", "aditya@gmail.com", "bhushan@gmail.com", "chetankumar@gmail.com", "darshan@gmail.com",
				"ekta@gmail.com", "farhan@gmail.com", "gautam@gmail.com", "hemant@gmail.com", "ishu@gmail.com",
				"jitendra@gmail.com", "kailash@gmail.com", "laxman@gmail.com", "mayank@gmail.com", "nitish@gmail.com",
				"omkar@gmail.com", "pranav@gmail.com", "qamar@gmail.com", "rakesh@gmail.com", "shubham@gmail.com",
				"tushar@gmail.com", "umesh@gmail.com", "vipin@gmail.com", "wasim@gmail.com", "xenon@gmail.com",
				"yashwant@gmail.com", "zeel@gmail.com", "anand@gmail.com", "bikash@gmail.com", "chirag@gmail.com",
				"darshil@gmail.com", "ekagra@gmail.com", "faraz@gmail.com", "girishkumar@gmail.com", "harsh@gmail.com",
				"irfan@gmail.com", "jayesh@gmail.com", "kumar@gmail.com", "lilan@gmail.com", "mahesh@gmail.com",
				"naveen@gmail.com", "omprakash@gmail.com", "pratik@gmail.com", "qadeer@gmail.com", "rajat@gmail.com",
				"sameer@gmail.com", "tapan@gmail.com", "umair@gmail.com", "vansh@gmail.com", "yashraj@gmail.com"
);
		
		for(String email : li) {
			Thread t = new Emails(email);
			ex.submit(t);
		}
	}
}

class Emails extends Thread {

	private String msg;

	public Emails(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + msg);
	}
}
