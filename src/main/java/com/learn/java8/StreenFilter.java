package com.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.fasterxml.jackson.core.sym.Name;

public class StreenFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Hari", "Sharath", "Rakesh", "Sudheer");
		
		for (String string : names) {
			if (!string.equals("Sudheer")) {
				
				System.out.println("Tredistional Design    "+ string);
				
			}
		}
		
		
		names.stream()
				.filter(new Predicate<String>()
				{
					public boolean test(String name) {
						return !name.equals("Sudheer");
						
					}
				})
				.forEach(name -> System.out.println("implementing predicate function  " +name));
		
		names.stream()
		.filter(name -> !name.equals("Sudheer"))
		.forEach(name -> System.out.println("By using lamidas---" + name));
		
		
		
		
	}

}
