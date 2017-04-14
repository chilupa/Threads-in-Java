package com.javathreads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is Running");
		System.out.println("Name of the thread is: "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.setName("Thread-1"); 
		/*
		 * we can even set the name the thread at the time of instantiating a new Thread.
		 * Syntax:
		 * Thread thread = new Thread(myRunnable, "Thread-1");
		 * The second argument of the above method sets the name of the Thread
		 * */
		thread.start();
	}
}
