package org.core.java.practices;

public class ThreadJoinDemo extends Thread{

	public void run() {
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
				System.out.println(i + " executed by "+currentThread());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadJoinDemo thread1 = new ThreadJoinDemo();
		thread1.setName("Thread-One");
		thread1.setPriority(NORM_PRIORITY);
		
		ThreadJoinDemo thread2 = new ThreadJoinDemo();
		thread2.setName("Thread-Two");
		thread2.setPriority(MIN_PRIORITY);
		
		ThreadJoinDemo thread3 = new ThreadJoinDemo();
		thread3.setName("Thread-Three");
		thread3.setPriority(MAX_PRIORITY);
		
		thread1.start();
		try {
			thread1.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		thread2.start();
		thread3.start();
	}

}
