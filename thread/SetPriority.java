package com.thread;

public class SetPriority extends Thread{
	public void run() {
		Thread.currentThread().setName("child thread");
		System.out.println(Thread.currentThread().getName()+" Priority "+Thread.currentThread().getPriority());
	}

	public SetPriority() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		SetPriority t = new SetPriority();
		Thread t1 = new Thread("moika");
		t1.start();
		System.out.println(t1.getName());
		
		t.start();
		//t.setPriority(7);
		System.out.println(t.getPriority());
		
	}

}

