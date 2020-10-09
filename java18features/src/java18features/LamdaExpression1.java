package java18features;

import java.util.Arrays;
import java.util.List;

public class LamdaExpression1 {
	
	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		for (int i:list)
		{
			System.out.println("Values- A " + i); 
		}
		/*
		 * Same code using lamda expression 
		 * -> lamda expression
		 */
		list.forEach(i -> System.out.println("Values- B " + i));
		/*
		 * In an expanded form
		 */
		list.forEach((Integer i) -> System.out.println("Values- C " + i));
		

	}

}
