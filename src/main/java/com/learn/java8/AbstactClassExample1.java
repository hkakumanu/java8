package com.learn.java8;

public class AbstactClassExample1 {

	public static void main(String[] args) {
		
		// HarishRobot hariRobot = new HarishRobot(); //we can't instantiate abstract class  
		//SudheerRobot SudheerRobot = new SudheerRobot(); //we can't instantiate abstract class 
		
		PraveenRobot praveenRobot = new PraveenRobot();
		praveenRobot.dance();
		praveenRobot.sing();
		praveenRobot.talk();
		praveenRobot.phoneCall();

	}

}


abstract class HarishRobot {
	
	public  void phoneCall() {
		System.out.println("Calling.....");
	}
	public abstract void dance();
	public abstract void sing();
	public abstract void talk();
}

abstract class SudheerRobot extends HarishRobot {

	public void sing() {
		System.out.println("Singing.....");
		
	}
	
}

class PraveenRobot extends SudheerRobot{
	
	public  void dance() {
		System.out.println("Dansing.....");
	}
	public  void talk() {
		System.out.println("Talking.....");
	}
}
