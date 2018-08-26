package org.core.java.practices;

class Vehicle{
	protected void run() {
		System.out.println("protected void run() {......} ");
	}
}

class Apache extends Vehicle{
	@Override
	public void run() {
		System.out.println("public void run() {......} overrides parent method.");
	}
}

public class MethodOverridingMain {

	public static void main(String[] args) {
		Apache tvs = new Apache();
		tvs.run();
	}

}
