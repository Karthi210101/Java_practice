package part3;
import java.util.*;
public class Exceptionhndling {
	static Scanner s = new Scanner("System.in");
	public static void main (String[]args) {
	
	try {
		System.out.println("Hi");
		System.out.println(8/0);
		System.out.println("I will be ignored !");
	}
	catch(ArithmeticException e ) {
		System.out.println("arithmetic exception");
		}
	finally {
		System.out.println("8");
		System.out.println("Bye");
	}
	}

}
