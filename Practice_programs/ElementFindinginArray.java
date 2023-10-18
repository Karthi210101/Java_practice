package part3;
import java.util.Scanner;

public class Arrayprogram {
	static Scanner s = new  Scanner(System.in);
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array ");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements one by one :");
		for (int i = 0;i<arr.length;i++) {
			arr[i]=s.nextInt();	
			}
		System.out.println("Enter the element to search : ");
		int key = s.nextInt();
		for(int j=0;j<arr.length;j++) {
			if(key==arr[j])
				System.out.println("Element found at index "+j);
			else
				System.out.println("Please enter the element present in the array ");
		}

	}

}
