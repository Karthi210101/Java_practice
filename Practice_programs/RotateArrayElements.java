package part1;
import java.util.*;
public class RotateArray {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the length of the array : ");
		int len = s.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter the elements of the array :");
		for(int i =0;i<len;i++) {
			arr[i]=s.nextInt();
		}
		
		System.out.println("Enter the number of times to shift right");
		int no = s.nextInt();
		int last;
		for(int i =0;i<no;i++) {
			last = arr[len-1];
			for(int j =len-1;j>0;j--) {
				arr[j]=arr[j-1];
				
			}
			arr[0]=last;
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
