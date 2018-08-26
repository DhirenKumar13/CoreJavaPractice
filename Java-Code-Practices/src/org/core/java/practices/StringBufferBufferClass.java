package org.core.java.practices;

public class StringBufferBufferClass {

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("Hello");
		StringBuffer b = new StringBuffer("Hello");
		System.out.println(a.hashCode()+ " a object hashcode");
		System.out.println(b.hashCode()+ " b object hashcode");
		StringBuffer c = b;
		b.append( " Dhiren to Java");
		System.out.println("b after append "+b);
		System.out.println("c after append "+c);
		System.out.println(c.hashCode()+ " c object hashcode");
		if(a == b ) {
			System.out.println("a and b objects are == categorically same ...");
		}else if (b == c){
			System.out.println("b and c objects are == categorically same ...");
		}else {
			System.out.println("NOT SAME BY == OPERATOR ..");
		}
		if(a.equals(b)) {
			System.out.println("a and b objects are equals() categorically same ...");
		}else if (b.equals(c)){
			System.out.println("b and c objects are equals() categorically same ...");
		}else {
			System.out.println("NOT SAME BY equals() OPERATOR ..");
		}
	}

}
