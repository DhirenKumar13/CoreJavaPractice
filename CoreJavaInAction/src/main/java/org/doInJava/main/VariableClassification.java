package org.doInJava.main;

public class VariableClassification {
	
	private static Integer counter = 0;
	
	public VariableClassification(Integer rank) {
		counter = counter + 1;
	}
	
	public void display() {
		System.out.println("Counter is : "+counter);
	}

	public static void main(String[] args) {
		VariableClassification v1 = new VariableClassification(1);
		VariableClassification v2 = new VariableClassification(2);
		VariableClassification v3 = new VariableClassification(3);
		VariableClassification v4 = new VariableClassification(4);
		VariableClassification v5 = new VariableClassification(5);
		VariableClassification v6 = new VariableClassification(6);
		VariableClassification v7 = new VariableClassification(7);
		v7.display();
		
		System.out.println("No. of objetcs created is : "+counter);
	}

}
