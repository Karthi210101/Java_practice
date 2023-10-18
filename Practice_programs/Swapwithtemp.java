package part1;
import java.util.Scanner;

public class Swapwithtemp {

	static Scanner s= new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter the first element: ");
       int a = s.nextInt();
       System.out.println("Enter the value of second element: ");
       int b =s.nextInt();
       int temp = 0;
       temp=a;
       a=b;
       b=temp;
       System.out.println("first element after swap: "+a);
       System.out.println("second element after swap: "+b);
       
	}

}
