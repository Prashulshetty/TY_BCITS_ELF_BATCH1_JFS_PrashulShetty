package com.bctis.waitmehod;

public class Thread1 extends Thread {
	public synchronized  void run() {
		System.out.println("thread is created..");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				wait(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
				
			}
		}
	}
}