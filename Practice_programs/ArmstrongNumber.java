package part1;
import java.util.Scanner;

public class Armstrongnumber{

static Scanner s = new Scanner(System.in); 
public static void main( String []args) {
	System.out.println("Enter the number : ");
	int num = s.nextInt();;
	int temp = num;
	int res = 0;
	int last = 0;
	
	while(num>0) {
		last = num%10;
		res+=Math.pow(last,3);
		num/=10;
		
			
		}
	if (res==temp) {
		System.out.println("The given number "+temp+" is a armsrong number ");
	}
	else
		System.out.println("The given number "+temp+" is not a armstrong number ");
	}
}

