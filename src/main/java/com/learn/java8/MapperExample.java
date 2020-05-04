package com.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class MapperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Hari", "Sharath", "Rakesh", "Sudheer");
		
		
		for (String string : names) {
			if (!string.equals("Sudheer")) {
				User user = new User(string);
				System.out.println("Tredistional Design    " + user);

			}
		}
		 
		
		names.stream()
		.filter(name -> !name.equals("Sudheer"))
		.map(name -> new User(name))
		.forEach(name -> System.out.println("By using lamidas---" + name));
		
		 
		
		names.stream()
		.filter(name -> !name.equals("Sudheer"))
		.map(name -> new User(name))
		.collect(Collectors.toList());
		//.forEach(name -> System.out.println("By using lamidas with return---" + name));
	}
	
	
	static class User{
		private String name;
		private Integer age = 30;
		
		public User(String name) {
			this.name = name;
		} 
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + "]";
		}
		
		
	}
}
