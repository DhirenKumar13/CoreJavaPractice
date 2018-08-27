package org.java.coding.javabasics;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueImplementation {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Andrew");
		queue.add("Bicky");
		queue.add("Client");
		queue.add("Dhiren");
		queue.add("Smith");
		
		System.out.println("HEAD is at :"+queue.peek());
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.poll();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Iterator<String> itr1 = queue.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		queue.poll();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Iterator<String> itr2 = queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
