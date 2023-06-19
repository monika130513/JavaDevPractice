package com.thread;

	public class RunnableDemo {

		public static void main(String[] args) {
			System.out.println("Thread "+Thread.currentThread().getName());
			MyRunnableThread mt = new MyRunnableThread();
			Thread t = new Thread(mt);
			t.start();
			
	    }
			
	}
	class MyRunnableThread implements Runnable{
		
		@Override
		public void run() {
		System.out.println("Runnable Method in child class"+Thread.currentThread().getName());
		
		}

	}
