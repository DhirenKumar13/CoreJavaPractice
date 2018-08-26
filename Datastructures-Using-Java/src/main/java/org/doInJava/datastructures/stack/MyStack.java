package org.doInJava.datastructures.stack;

public class MyStack<R> {
	
	private R[] data;
	private int currentPointer;
	
	@SuppressWarnings("unchecked")
	public MyStack() {
		data = (R[]) new Object[1000];
		currentPointer = 0;
	}
	
	public void push(R item) {
		data[currentPointer++] = item;
	}
	
	public R pop() {
		if(currentPointer == 0) {
			throw new ElementNotFoundException("No Element Found");
		}
		return data[--currentPointer];
	}
	
	public boolean contains(R item) {
		boolean found = false;
		for(int i = 0; i < currentPointer; i++) {
			if(data[i].equals(item)) {
				found = true;
			}
		}
		return found;
	}
	
	public R access(R item) {
		while(currentPointer > 0) {
			R itemReturnedFromStack = pop();
			if(itemReturnedFromStack.equals(item)) {
				return itemReturnedFromStack;
			}
		}
		throw new ElementNotFoundException("Not Found "+item);
	}
	
	public int size() {
		return currentPointer;
	}

}
