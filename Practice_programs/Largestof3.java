package part1;
import java.util.*;
public class largestin3num {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the first number ");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("Enter the third number");
		int c = sc.nextInt();
		
		if (a>b && a>c)
			System.out.println("The largest number amoung three number is :"+a);
		else if (b>c)
			System.out.println("The largest number amoung three numbers is :"+b);
		else 
			System.out.println("the largest number amoung three number is :"+c);

			
		
		

	}

}
