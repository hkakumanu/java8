package com.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learn.java8.MapperExample.User;

public class FlatMapExample {

	public static void main(String[] args) {
		
		
		List<User> users = Arrays.asList(
				new User("Hari", 25, Arrays.asList("1", "2", "3")),
				new User("Ravi", 27, Arrays.asList("4", "5")),
				new User("Giri", 35, Arrays.asList("6")),
				new User("Ramu", 28, Arrays.asList("7", "8", "9"))
				);
	
	 Optional<String> stringOptional =  users.stream()
	.map(user -> user.getPhoneNumebers().stream())
	.flatMap(stringStreem -> stringStreem.filter(phoneNo -> phoneNo.equals("9")))
	.findAny();
	 
	 stringOptional.ifPresent(System.out::println);
	 
	 
	 List<String> names = users.stream()
	 .map(user -> user.getName())
	 .collect(Collectors.toList());
	 
	 System.out.println("User Names" + names);
}


static class User{
	private String name;
	private Integer age = 30;
	private List<String> phoneNumebers;
	
	
	
	public User(String name, Integer age, List<String> phoneNumebers) {
		this.name = name;
		this.age = age;
		this.phoneNumebers = phoneNumebers;
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
	
	public List<String> getPhoneNumebers() {
		return phoneNumebers;
	}

	public void setPhoneNumebers(List<String> phoneNumebers) {
		this.phoneNumebers = phoneNumebers;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", phoneNumebers=" + phoneNumebers + "]";
	}

	
	
	
}
}
