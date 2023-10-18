package part1;
import java.util.Scanner;

public class Factorsofnumber {
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		System.out.println("The factors of the number"+n+" are :");
		for (int i =1;i<n;i++) {
			if(n % i == 0)
			{ 
				System.out.print(i+" ");
			}
		}
		

	}

}
