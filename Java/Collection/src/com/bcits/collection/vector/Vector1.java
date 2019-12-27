package com.bcits.collection.vector;

import java.util.LinkedList;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		  Vector<Integer> v1 =new Vector<Integer>();
		     v1.add(88);
		     v1.add(98);
		     v1.add(77);
		     System.out.println(v1);
		     v1.add(77);
		    System.out.println(v1);
		     v1.add(null);
		     System.out.println(v1);
		     System.out.println(v1.size());
	        System.out.println(v1.isEmpty());
	        v1.setSize(8);
	        System.out.println(v1);
	        v1.insertElementAt(40, 2);
	        System.out.println(v1);
	        v1.removeElement(88);
	        System.out.println(v1);
	        v1.setElementAt(100, 5);
	        System.out.println(v1.capacity());
	        v1.trimToSize();
	        System.out.println(v1.capacity());
	        System.out.println(v1.size());
	        v1.ensureCapacity(10);
	        System.out.println(v1.capacity());
	        System.out.println(v1.size());
	        System.out.println(v1);
	        v1.capacity();
	        System.out.println(v1);
	}

}
