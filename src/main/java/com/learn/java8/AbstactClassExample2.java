package com.learn.java8;

public class AbstactClassExample2 {

	public static void main(String[] args) {
		 Phone phone1 =new Iphone();
		 phone1.showConfig();
		 phone1.normalMethod();
		 Phone phone2 =new Samsung();
		 phone2.showConfig();
		 phone2.normalMethod();
	}

}

abstract class Phone {
	public abstract void showConfig();
	
	public void normalMethod() {
		System.out.println("normal method");
	}
}


class Iphone extends Phone{
	public void showConfig() {
		System.out.println("2 Gb, IOS 11.3");
	}
}

class Samsung extends Phone{
	public void showConfig() {
		System.out.println("3 GB, Android lollypop");
	}
}