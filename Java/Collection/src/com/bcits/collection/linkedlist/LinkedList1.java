package com.bcits.collection.linkedlist;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
     LinkedList<Integer> l1 =new LinkedList<Integer>();
     l1.add(88);
     l1.add(98);
     l1.add(77);
     l1.add(77);
     l1.add(null);
     System.out.println(l1);
     l1.remove(new Integer(77));
     System.out.println(l1);
     System.out.println(l1.isEmpty());
     System.out.println(l1.size());
     
     LinkedList<Integer> l2 =new LinkedList<Integer>();
     l2.add(80);
     l2.add(98);
     l2.add(77);
     System.out.println(l2);
     
     
     
     l2.addAll(l1);
     System.out.println(l2);
     
     
     l2.retainAll(l1);
     System.out.println(l2);
     
     
     l2.removeAll(l1);
     System.out.println(l2);
     
     
     
	}

}
