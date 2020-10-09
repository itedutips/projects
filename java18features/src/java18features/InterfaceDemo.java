package java18features;

interface Phone
{
	void call();
	/*
	 * New feature in Java 1.8
	 * Method definition allowed if default keyword is used.
	 */
	default void message()
	{
		System.out.println("Message!"); 
	}
	
}
class AndroidPhone implements Phone
{

	@Override
	public void call() {
		System.out.println("Call!");
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
	
		AndroidPhone phone = new AndroidPhone();
		phone.call();
		phone.message();
	}

}
