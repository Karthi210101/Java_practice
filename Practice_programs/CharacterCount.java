package part3;
import java.util.*;
public class Charcount {
	static Scanner s = new Scanner(System.in);
	public static void main(String []args ) {
		System.out.println("Enter the string : ");
		String str = s.nextLine();
		String s1=str.trim();
		char[] a = s1.toCharArray();
		int b = a.length;
		System.out.println("The total number of characters in the given string"+str+" is : "+b);
	}

}
