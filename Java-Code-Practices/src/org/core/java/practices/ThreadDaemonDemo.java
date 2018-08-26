package org.core.java.practices;

public class ThreadDaemonDemo extends Thread{

	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("It is a deamon thread ."+currentThread().getName());
			System.out.println(Thread.activeCount());
		}else {
			System.out.println("It is a user thread ."+currentThread().getName());
			if("Thread-One".equals(currentThread().getName())) {
				this.interrupt();
			}
			System.out.println(Thread.activeCount());
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadDaemonDemo thread1 = new ThreadDaemonDemo();
		thread1.setName("Thread-One");
		thread1.setPriority(NORM_PRIORITY);
		
		ThreadDaemonDemo thread2 = new ThreadDaemonDemo();
		thread2.setName("Thread-Two");
		thread2.setDaemon(true);
		thread2.setPriority(MIN_PRIORITY);
		
		ThreadDaemonDemo thread3 = new ThreadDaemonDemo();
		thread3.setName("Thread-Three");
		thread3.setPriority(MAX_PRIORITY);
		
		thread1.start();
		thread1.join();
		thread2.start();
		thread3.start();
		
	}

}
