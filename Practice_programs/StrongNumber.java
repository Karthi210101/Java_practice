package part1;
import java.util.Scanner;

public class Strongnumber {
	static Scanner s = new Scanner (System.in); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number :");
		int num=s.nextInt();
		int temp = num;
		int fact;
		int sum = 0;
		int last = 0;
		while(num>0){
			
			last=num%10;
			fact=1;
			for(int i=0;i<=last;i++) {
			fact*=i;
			}
			sum+=fact;
			num/=10;
		}
		if(temp == sum)
			System.out.println("The given number "+temp+" is a strong number. ");
		else
			System.out.println("The given number "+temp+" is not a strong number. ");

	}

}
