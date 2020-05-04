package com.learn.java8.multiThreading;

class Hi implements Runnable
{
	
	public void run()
	{
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi  running");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}

class Hello implements Runnable
{
	
	public void run()
	{
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello  running");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}


public class RunnableInterfaceExample {

	public static void main(String[] args) {
		
		Runnable runnable1 = new Hi();
		Runnable runnable2 = new Hello();
		
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		//runnable1.start();  //we cannot start() method from Runnable interface
		thread1.start();   //After pass Runnable object into Tread class only we can call start()
		try {
			Thread.sleep(10);
		} catch (Exception e) {}
		//runnable2.start();  //we cannot start() method from Runnable interface
		thread2.start();

	}

}
