package java18features;

interface I
{
	default void show()
	{
		System.out.println("Show from interface I");
	}
}

interface J extends I
{
	default void show()
	{
		System.out.println("Show from interface J");
		
	}
}
/*
 * Java does not support multiple inheritance for classes .
 * For interfaces it can be done as follows.
 */
public class InheritanceExp implements I, J {
	
	public static void main(String[] args) {
		
		new InheritanceExp().show();
		
	}

}
