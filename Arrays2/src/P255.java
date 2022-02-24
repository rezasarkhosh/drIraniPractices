import java.util.Scanner;

public class P255 {

	public static void main(String[] args) {
		 Scanner input=new Scanner (System.in);
		
		 int A[][]=new int [2][2];
		 for (int x=0;x<2;x++)
		  for (int y=0;y<2;y++)
			 A[x][y]=input.nextInt();		 
		
		  for ( int x=0;x<10;x++)
			  System.out.print(A[x][10-x+1]);
	}

}
