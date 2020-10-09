package java18features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamMapExample {
	
//	public static void main(String[] args) {
//			
//			List<String> list = Arrays.asList("Alex","Chris","David","Stephan","Luke");
//			list.stream().filter((String name) -> !name.equals("Alex") 
//			).map(new Function<String, User>() {
//
//				@Override
//				public User apply(String name) {
//					
//					return new User(name);
//				}
//			}).forEach(new Consumer<User>() {
//
//				@Override
//				public void accept(User t) {
//					System.out.println(t); 
//					
//				}
//			});
//	}
//	public static void main(String[] args) {
//		
//		List<String> list = Arrays.asList("Alex","Chris","David","Stephan","Luke");
//		list.stream().filter((String name) -> !name.equals("Alex") 
//		).map((String name) -> {
//				return new User(name);
//			}
//		).forEach((User t) ->{
//				System.out.println(t); 
//				
//			}
//		);
//   }
	
//	public static void main(String[] args) {
//		
//		List<String> list = Arrays.asList("Alex","Chris","David","Stephan","Luke");
//		list.stream().filter((String name) -> !name.equals("Alex") 
//		).map((name) -> {
//				return new User(name);
//			}
//		).forEach((t) ->{
//				System.out.println(t); 
//				
//			}
//		);
//    }
	
//    public static void main(String[] args) {
//		
//		List<String> list = Arrays.asList("Alex","Chris","David","Stephan","Luke");
//		list.stream().filter((String name) -> !name.equals("Alex") )
//					 .map((name) -> new User(name))
//					 .forEach((t) -> System.out.println(t));
//    }
    
    public static void main(String[] args) {
  		List<String> list = Arrays.asList("Alex","Chris","David","Stephan","Luke");
  		list.stream().filter((String name) -> !name.equals("Alex") )
  					 .map((name) -> new User(name))
  					 .forEach(System.out::println);
    }
    
	static class User
	{
		String name;
		int age = 42;
		
		public User(String name) {
			this.name = name;
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
		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + "]";
		}
		
		
	}
		
}

