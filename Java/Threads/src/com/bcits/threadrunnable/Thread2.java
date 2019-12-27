package com.bcits.threadrunnable;

public class Thread2 implements Runnable{
	public void run() {
		System.out.println("thread is created..");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
