package com.learn;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import org.w3c.dom.UserDataHandler;

public class FlatMapExample1 {

//
//	public static void main(String[] args) {
//		List<User> list = Arrays.asList
//		(
//			new User("Alex", 40,Arrays.asList("1","2","5","7")),
//			new User("Chris", 50,Arrays.asList("11","12","15","17")),
//			new User("Mathew", 55,Arrays.asList("90","92","95","97"))
//			
//		);
//		list.stream().flatMap(new Function<User, Stream<? extends String>>() {
//
//			@Override
//			public Stream<? extends String> apply(User t) {
//				return t.getPhoneNumbers().stream();
//			}
//		}).filter((String t) -> {
//			return t.equals("17");
//		}).forEach(System.out::println); 
//	
//	}
	
	public static void main(String[] args) {
		List<User> list = Arrays.asList
		(
			new User("Alex", 40,Arrays.asList("1","2","5","7")),
			new User("Chris", 50,Arrays.asList("11","12","15","17")),
			new User("Mathew", 55,Arrays.asList("90","92","95","97"))
			
		);
		list.stream().flatMap((User t) -> {
				
				return t.getPhoneNumbers().stream();
			}
		).filter((String t) -> t.equals("17"))
		  .forEach(System.out::println); 
		
		
		
	}


	static class User
	{
		String name;
		int age;
		List<String> phoneNumbers;
		
		public User(String name, int age, List<String> phoneNumbers) {
			super();
			this.name = name;
			this.age = age;
			this.phoneNumbers = phoneNumbers;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public List<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		public void setPhoneNumbers(List<String> phoneNumbers) {
			this.phoneNumbers = phoneNumbers;
		}
		
	}

}
