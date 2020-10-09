package java18features;

interface Base
{
	void show(int i);
	default void call() {}
	
}

//class BaseImp implements Base
//{
//	@Override
//	public void show(int i) {
//		System.out.println("Show called from base with arg." + i); 
//	}
//}
//
//public class LamdaExpression2 {
//	
//
//	public static void main(String[] args) {
//	
//		 Base base;
//		 base = new Base() {
//				
//				public void show(int i) {
//					System.out.println("Show called from base with arg." + i); 
//				}
//		 };
//		 int i =0;
//		 base.show(i);
//	}			
//}


//public class LamdaExpression2 {
//	
//
//	public static void main(String[] args) {
//	
//		 Base base;
//		 base =(int i) -> {
//					System.out.println("Show called from base with arg." + i); 
//				};
//		 
//		 int i =0;
//		 base.show(i);
//	}			
//}

//public class LamdaExpression2 {
//	
//
//	public static void main(String[] args) {
//	
//		 Base base;
//		 base =(int i) -> System.out.println("Show called from base with arg." + i); 		
//		 
//		 int i =0;
//		 base.show(i);
//	}			
//}

public class LamdaExpression2 {
	

	public static void main(String[] args) {
	
		 Base base;
		 base =(i) -> System.out.println("Show called from base with arg." + i); 
				
		 
		 int i =0;
		 base.show(i);
	}			
}



