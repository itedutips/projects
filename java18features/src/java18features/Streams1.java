package java18features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.jar.Attributes.Name;

//public class Streams1 {
//	
//	public static void main(String[] args) {
//		
//		List<String> list = Arrays.asList("Alex","Chris","David","Stephan","Luke"); 
//		
//		list.stream().filter(new Predicate<String>() {
//
//			@Override
//			public boolean test(String name) {
//				return (!name.equals("Alex")); 			
//			}
//		}).forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String str) {
//				
//				System.out.println(str); 
//			}
//		});
//	
//	}
//
//}
//public class Streams1 {
//	
//	public static void main(String[] args) {
//		
//		List<String> list = Arrays.asList("Alex","Chris","David","Stephan","Luke"); 
//		
//		list.stream().filter((String name) -> {
//				return (!name.equals("Alex")); 			
//			}
//		).forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String str) {
//				
//				System.out.println(str); 
//			}
//		});
//	
//	}
//
//}

//public class Streams1 {
//	
//	public static void main(String[] args) {
//		
//		List<String> list = Arrays.asList("Alex","Chris","David","Stephan","Luke"); 
//		
//		list.stream().filter((String name) -> {
//				return (!name.equals("Alex")); 			
//			}
//		).forEach((String str) -> {
//				
//				System.out.println(str); 
//			}
//		);
//	
//	}
//}

//public class Streams1 {
//	
//	public static void main(String[] args) {
//		
//		List<String> list = Arrays.asList("Alex","Chris","David","Stephan","Luke"); 
//		
//		list.stream().filter((name) -> {
//				return (!name.equals("Alex")); 			
//		}
//		).forEach((str) -> System.out.println(str)); 
//	}
//
//}
public class Streams1 {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Alex","Chris","David","Stephan","Luke"); 
		
		list.stream().filter((name) ->  !name.equals("Alex"))
					 .forEach((str) -> System.out.println(str)); 
	}

}
