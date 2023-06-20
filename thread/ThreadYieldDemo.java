package com.thread;

	public class ThreadYieldDemo implements Runnable {

		public ThreadYieldDemo() {
		// TODO Auto-generated constructor stub
		}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Child thread");
		}
		Thread.yield();
	}
	public static void main(String []args) {
	 ThreadYieldDemo t = new ThreadYieldDemo();
	 Thread mt = new Thread(t);
	 mt.start();
	 	for(int i = 0; i < 10; i++) {
		 System.out.println("main Thread");
	 	}
	}
}
