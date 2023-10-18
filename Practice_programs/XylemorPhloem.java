package part1;
import java.util.*;

public class Xylem {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number : ");
		int num = s.nextInt();
		int sum,mean_sum,temp,last;
		sum =0;mean_sum=0;temp = num;last = num%10;
		num /=10;
		while(num>9)
		{
			mean_sum = mean_sum +num%10;
			num/=10;	
		}
		sum=last+num;
		if(sum==mean_sum){
			System.out.println(temp+" is a xylem number ");
		}
		else 
			System.out.println(temp+" is a phloem number ");
		
	}
}
		
