package ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Demo {
	public static void main(String[] args) {
		test t = new test();
		t.m1();
	}

}
class test{
	ReentrantLock lock = new ReentrantLock(true); // this ensure the  first in first out
	
	public void m1() {
		lock.lock(); // synchronization start
		System.out.println("line no 1");
		System.out.println("line no 2");
		System.out.println("line no 3");
		System.out.println("line no 4");
		System.out.println("line no 5");
		System.out.println("line no 6");
		System.out.println("line no 7");
		System.out.println("line no 8");
		System.out.println("line no 9");
		System.out.println("line no 10");
		System.out.println("line no 11");
		System.out.println("line no 12");
		m2();
		
	}
	
	public void m2() {
		System.out.println("line no 2");
		lock.unlock(); //synchronization end
		System.out.println("after syncronization");
	}
	
	
}
