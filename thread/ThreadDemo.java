package com.thread;

public class ThreadDemo {

	public ThreadDemo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		for(int i = 0; i < 10; i++) {
			System.out.println("main Thread");
		}
		mt.start();
	}
}
