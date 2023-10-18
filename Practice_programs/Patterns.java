package part1;

public class Pattern {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		pattern31(5);//
////		floydtriangle(5);
//		zoho1(5);
//		x(5);
//	zohoprob1("GEEKSFORGEEKS");}
		pattern(3);}
	static void pattern1(int n){
		for(int row = 0;row <= 2*n;row++) {
			int noofcol = row > n ? 2*n -  row : row  ;
			
			int noofspaces = n - noofcol;
			for (int s= 0;s<=noofspaces;s++) {
				System.out.print(" ");
		   		}	
			
				for(int col = 0;col <= noofcol;col++) {
					System.out.print("* ");
			}
					System.out.println();
		}
	}
	static void pattern30(int n) {
		for(int row =1;row< n;row++) {
			for (int space = 0 ; space < n-row ; space++ ) {
				System.out.print(" ");
			}
			for(int col=row;col>=1;col--) {
				System.out.print(col);
			}
			for(int col=2;col>1;col++) {
				System.out.print(col);
			}
		}
		System.out.println( );
	}
	//floyd's triangle//
	static void floydtriangle (int n) {
		int k = 1;
		for (int i = 0;i<n;i++) {
			for (int j = 0; j<=i;j++) {
				System.out.print( k+" ");
				k++;
			}
			System.out.println();
		}
	}
	static void rightangledtriangle(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
	}
	
	static void pattern31(int n) {
		int k =1;
		for (int i = 0;i<n;i++) {
			for(int j =0;j<=i;j++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	
	}
	static void zoho1(int n ) {
		int m = (n+1)/2;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				if(i==j)
				{
					if(i<m)
						System.out.print(n-i+1+" ");
					else
						System.out.print(i+" ");
				}
				else if(i+j == n+1){
					if(i<m)
						System.out.print(i+" ");
					else
						System.out.print(j+" ");
			
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	static void x(int n) {
		int m = (n+1)/2;
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j <=n ; j++) {
				if(i==j) {
					System.out.print("* ");
				}
				else if(i+j==n+1){
					System.out.print("* ");
					
				}
				else
					System.out.print("  ");
				
			}
			System.out.println();
			
		}
	}
	static void zohoprob1 (String s) {
		int l = s.length();
		for(int i =0;i<l;i++) {
			for(int j = 0;j<l;j++) {
				if(i==j||i+j==l-1)
					System.out.print(s.charAt(j)+" ");
				else
					System.out.print("  ");
				}
					System.out.println();
			}
		}




static void pattern (int n ) {
System.out.println(" enter the value for n ");

int k =1;
for(int i = 0;i<n;i++){
	for(int j = 0;j<n;j++){
		if(i==j||j<i)
			{System.out.print(k);
			k++;
			}
		else
			System.out.print(" ");
		
		}
		System.out.println();
		
		}
	  
}}
