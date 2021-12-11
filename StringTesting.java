package AssingmentWeek3Day1;

public class StringTesting {

	public static void main(String[] args) {
		String str3 = new String("Kutty");
		String str4 = new String("Kutty");
		 
		if(str3==str4) {
			System.out.println("Same text");
		}
		else
			System.out.println("Diff text");
		
		if(str3.equalsIgnoreCase(str4))
		{
			System.out.println("Same text");
		}
		else
			System.out.println("Diff text");
		 
		System.out.println("*****");
	}
}