package org.core.java.practices;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

class Temp{
	public String toString() {
		return "Hey Temp ! What Happened !!";
	}
	public void finalize() {
		System.out.println("You will be destroyed !!! ");
	}
}

public class WeakMapDemo {

	public static void main(String[] args) {
		
		Map<Temp, String> hashmap = new HashMap<>();
		Map<Temp, String> weakhashmap = new WeakHashMap<>();
		
		Temp temp = new Temp();
		hashmap.put(temp,"Dhiren");
		System.out.println(hashmap);
		System.out.println("setting object as null and calling GC.");
		temp=null;
		System.gc();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(hashmap);
		
		System.out.println("***************************************");
		
		System.out.println("Same concept using weakHashmap");
		
		System.out.println("***************************************");
		
		Temp temp1 = new Temp();
		weakhashmap.put(temp1,"Dhiren");
		System.out.println(weakhashmap);
		System.out.println("setting object as null and calling GC.");
		temp1=null;
		System.gc();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(weakhashmap);
	}

}
