package part1;
import java.util.*;


public class Countofnumber {
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to count its digits :");
		long num = s.nextLong();
		long temp =num;
		int count = 0;
		while (num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("The total number of digits in given number "+temp+"is "+count);
	}

}
