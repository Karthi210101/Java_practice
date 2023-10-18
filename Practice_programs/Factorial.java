package part1;
import java.util.Scanner;
public class factorial {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		long fact = 1;
		for(long i =1;i<=num ;i++) {
			fact = fact*i;
		}
		System.out.println("The factorial of given number "+num+"is : "+fact);
		
		

	}

}
