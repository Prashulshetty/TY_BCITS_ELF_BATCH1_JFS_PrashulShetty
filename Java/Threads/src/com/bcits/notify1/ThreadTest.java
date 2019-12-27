package com.bcits.notify1;



public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("main started");
		 Thread2 t1 =new Thread2();
		 Thread2 t2 =new Thread2();
		 t1.start();
		 t2.start();
		 
		 try { 
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		 t1.leaveme();
		 System.out.println("main ended");
	}

}
