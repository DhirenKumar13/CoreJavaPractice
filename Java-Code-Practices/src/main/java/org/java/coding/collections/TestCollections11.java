package org.java.coding.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestCollections11{  
	 public static void main(String args[]){  
	  //Creating and adding elements  
	Set<String> list = new HashSet<>();
	list.add("Ravi");  
	list.add("Vijay");  
	list.add("Ravi");  
	list.add("Ajay"); 
	  TreeSet<String> al=new TreeSet<String>(list);  
	  Iterator<String> itr1=list.iterator();  
	  while(itr1.hasNext()){  
	   System.out.println(itr1.next()); 
	  }
	  System.out.println("**********************"); 
	  //Traversing elements  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	}  