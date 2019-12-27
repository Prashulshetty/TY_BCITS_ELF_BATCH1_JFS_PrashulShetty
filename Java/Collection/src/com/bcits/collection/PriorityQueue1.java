package com.bcits.collection;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		p.add(88);
		p.add(98);
		p.add(38);
		p.add(58);
		p.add(89);
		p.add(83);
		p.add(83);
		//p.add(null);
		System.out.println(p);
		p.remove();
		System.out.println(p);
		p.remove();
		System.out.println(p);
		p.remove();
		System.out.println(p);
		

	}

}
