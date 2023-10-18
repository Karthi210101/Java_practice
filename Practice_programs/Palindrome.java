package part1;
import java.util.Scanner;
public class palindrome {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter the number : ");
	int num = sc.nextInt();
	int rev =0;
	int temp = num;
		while(num>0) {
			rev = rev*10+num%10;
			num/=10;
		}
		
		String n= temp==rev ? "The given number is palindrome" :"The given number is not a palindrome" ;	
		System.out.println(n);
		
	}
}
