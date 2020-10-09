package java18features;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

//class ConsumerImp implements Consumer
//{
//
//	@Override
//	public void accept(Object arg0) {
//		
//		System.out.println("Message from Consumer Implemenation."); 
//		
//	}
//	
//}

//public class ConsumerExp {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		Consumer c;
//		c = new Consumer() {
//			public void accept(Object arg) 
//			{
//				System.out.println((Integer)arg);
//				
//			}
//		};
//		list.forEach(c);
//		
//	}
//
//}

//public class ConsumerExp {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		Consumer c;
//		c = (Object arg) ->
//		{
//			System.out.println((Integer)arg);
//			
//		};
//		
//		list.forEach(c);
//		
//	}
//
//}

//public class ConsumerExp {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		Consumer c;
//		c = (arg) -> System.out.println((Integer)arg);
//				
//		list.forEach(c);
//		
//	}
//
//}

//public class ConsumerExp {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> list = Arrays.asList(1,2,3,4,5);
//				
//		list.forEach((arg) -> System.out.println((Integer)arg));
//		
//	}
//
//}

public class ConsumerExp {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
				
		list.forEach((arg) -> System.out.println(arg));
	
		
	}

}



