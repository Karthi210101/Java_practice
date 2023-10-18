package part1;
import java.util.*;


public class Swap {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first element: ");
		int a= s.nextInt();
		System.out.println("Enter the second element: ");
		int b =s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap first element is "+a);
		System.out.println("After swap second element is "+b);
		
		
		

	}

}
