package com.learn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

import org.w3c.dom.UserDataHandler;

public class SteamsMapIntExample {

//	public static void main(String[] args) {
//		List<String> list = Arrays.asList("Alex","Stephan","Chris","Martin","Luke"); 
//		
//		int sum = list.stream().filter(new Predicate<String>() {
//
//			@Override
//			public boolean test(String t) {
//				
//				return true;
//			}
//		}).
//				mapToInt(new ToIntFunction<String>() {
//
//			@Override
//			public int applyAsInt(String value) {
//				int age = new User(value, 40).getAge();
//				System.out.println("age is "+ age); 
//				return age;
//			}
//		}).sum();
//		
//		System.out.println("sum is " + sum); 
//	
//	}
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Alex","Stephan","Chris","Martin","Luke"); 
		
		int sum = list.stream().filter((String t) -> !t.equals("Alex"))
				.mapToInt((String value) -> new User(value, 40).getAge())
				.sum();
		
		System.out.println("sum is " + sum); 
	
	}

	static class User
	{
		String name;
		int age;
		
		public User(String name, int age) {
			super();
			this.name = name;
			this.age = age;
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
		
	}

}
