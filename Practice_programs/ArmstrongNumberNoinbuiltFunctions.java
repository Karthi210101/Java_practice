package part1;

import java.util.Scanner;

public class armnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			String str=s.nextLine();
			int og = Integer.parseInt(str);
			int mul=1;
			int sum = 0;
			for(int i=0;i<str.length();i++)
			{
				mul = 1;
				for(int j=0;j<str.length();j++)
				{
				mul=mul*str.charAt(i);
				}
				sum +=mul;
			}
			if(og==sum)
				System.out.println(og+" is a Armstrong number");
			else
				System.out.println(og+" is not a Armstrong number");
	}

}
