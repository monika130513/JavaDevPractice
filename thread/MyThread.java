package com.thread;
public class MyThread extends Thread{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(" tread class");
		}
	}
	
	public MyThread() {
		// TODO Auto-generated constructor stub
	}
	

}
