package org.core.java.practices;

import java.io.IOException;

class VehicleDemo{
	protected void run() throws IOException{
		System.out.println("protected void run() {......} ");
	}
	public void changeGear() {
		System.out.println("Change Gear Method ..");
	}
	public void putPetrol() {
		System.out.println(" Petrol refueled ....");
	}
	public void mileage() throws ArithmeticException{
		System.out.println(" Haaah hhhaa haaaah ...");
	}
	public void drag() throws IOException{
		System.out.println(" Haaah hhhaa haaaah ...");
	}
}

class ApacheDemo extends VehicleDemo{
	@Override
	public void run() {
		System.out.println("public void run() {......} overrides parent method.");
	}
	
	@Override
	public void changeGear() {// throws IOException can't be added because parent method doesn't throw that exception
		//IOE is a checked exception hence can't be added
		System.out.println("Overriden method changeGear() ... ");
	}
	
	@Override
	public void putPetrol() throws ArithmeticException{
		System.out.println("It can throw unchecked exceptions .");
	}
	
	@Override
	public void mileage() {
		System.out.println("Exception can be removed while overriding .");
	}
	
	@Override
	public void drag() throws ArithmeticException{
		System.out.println("Exception can be removed while overriding OR we can add unchecked exceptions ..");
	}
}

public class OverrideException {

	public static void main(String[] args) {
		ApacheDemo tvs = new ApacheDemo();
		tvs.run();
		tvs.changeGear();
		tvs.putPetrol();
	}

}
