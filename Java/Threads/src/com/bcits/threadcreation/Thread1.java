package com.bcits.threadcreation;

public class Thread1 extends Thread {
	public void run() {
		System.out.println("thread is created..");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
