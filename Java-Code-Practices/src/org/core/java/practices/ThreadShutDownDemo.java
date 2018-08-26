package org.core.java.practices;

public class ThreadShutDownDemo extends Thread {

	private Boolean isRunning = true;
	
	@Override
	public void run() {
		isRunning = true;
		while (isRunning) {
			System.out.println("It is a thread ." + currentThread().getName());
			System.out.println(Thread.activeCount());
			setFlag();
		}
	}
	
	public void setFlag() {
		isRunning = false;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadShutDownDemo thread1 = new ThreadShutDownDemo();

		ThreadShutDownDemo thread2 = new ThreadShutDownDemo();

		thread1.start();

		thread2.start();
		
		System.out.println(thread1.getState());
		
		thread1.run();

	}

}
