package ReentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class test2 {

	public static void main(String[] args) throws InterruptedException {

		demo1 d = new demo1();
		d.m1();
	}
}

class demo1 {
	Lock l = new ReentrantLock(true);

	void m1() throws InterruptedException {

		l.tryLock(3, TimeUnit.SECONDS);
		System.out.println("line 1");
		
		
		m2();
		
	}
	void m2() {
		System.out.println("line 2");
		l.unlock();
	}
}
