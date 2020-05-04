package com.learn.java8.multiThreading;

class Tread1 extends Thread
{
	
	public void run()
	{
		for (int i = 1; i <= 5; i++) {
			System.out.println("Tread 1 running");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}

class Tread2 extends Thread
{
	
	public void run()
	{
		for (int i = 1; i <= 5; i++) {
			System.out.println("Tread 2 running");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}




public class TreadClassExample {

	public static void main(String[] args) {
		
		Tread1 tread1 = new Tread1();
		Tread2 tread2 = new Tread2();
		
		tread1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {}
		tread2.start();

	}

}
