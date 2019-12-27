package com.bcits.threadrunnable;

public class ThreadTest {

	public static void main(String[] args) {
		 System.out.println("main started");
		 Thread2 t1 =new Thread2();
		 Thread2 t2 =new Thread2();
		 Thread  t3 =new Thread(t1);
		 Thread  t4 =new Thread(t2);
		 t3.start();
		 t4.start();
		 System.out.println("main ended");
	}

}
