package part1;
import java.util.Scanner;

public class Fibonnacci {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1 = 0;
		int m2 = 1;
		int m3 = 0;
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		for(int i =0;i<n;i++){
			System.out.print(m1+" ");
			m3=m1+m2;
			m1=m2;
			m2=m3;
			}
	}

}
