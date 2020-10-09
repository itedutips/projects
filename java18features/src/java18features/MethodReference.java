package java18features;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	

//	public static void main(String[] args) {
//		
//		List<String> list = Arrays.asList("Alex","Chris","David","Stephan","Luke"); 
//		
//		list.stream().filter((name) -> {
//				return (!name.equals("Alex")); 			
//		}
//		).forEach((str) -> System.out.println(str)); 
//	}
	
//	public static void main(String[] args) {
//		
//		List<String> list = Arrays.asList("Alex","Chris","David","Stephan","Luke"); 
//		
//		list.stream().filter((name) -> {
//				return (!name.equals("Alex")); 			
//		}
//		).forEach(System.out::println); 
//	}
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Alex","Chris","David","Stephan","Luke"); 
		list.stream().filter(MethodReference::validateName)			
					 .forEach(System.out::println); 
	}
	
	public static boolean validateName(String name)
	{
		return (!name.equals("Alex"));
	}

}
