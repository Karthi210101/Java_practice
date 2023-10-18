package part1;
import java.util.*;
public class typeofchar {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the character : ");
		char ch = sc.next().charAt(0);
		if(ch >= 'A' && ch<= 'Z')
			System.out.println("The given character " +ch+" is in Uppercase. ");
		else if (ch >='a' && ch <= 'z')
			System.out.println("The given character " +ch+" is in lowercase. ");
		else if (ch >= '0' && ch <='9')
			System.out.println("The given character " +ch+" is an integer. ");
		else
			System.out.println("The given character " +ch+" is a special character ");

	

	}

}
