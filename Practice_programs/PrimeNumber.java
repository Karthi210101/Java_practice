package part1;
import java.util.Scanner;
public class prime {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		String result = "The given number is a prime number";
		if(num==0 || num==1)
			System.out.println("The given number"+num+" is not a prime number");
		else 
			{for (int i = 2;i < num; i++ )
			  {
				if (num%i == 0)
				  result = "The given number is not a prime number";
			  }
			System.out.println(result);		    

			}
	   
	}

}
