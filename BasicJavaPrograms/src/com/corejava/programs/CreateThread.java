package com.corejava.programs;

class RunnableThread implements Runnable{
	@Override
	public void run() {
		System.out.println("run method executing");
	}
}

public class CreateThread {
	public static void main(String[] args) {
		RunnableThread createThread = new RunnableThread();
		Thread thread = new Thread(createThread);
		thread.start();
	}
}
