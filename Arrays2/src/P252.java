import java.util.Scanner;

public class P252 {

	public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	  int A[][]=new int [10][10];
			for (int x=0;x<10;x++)
	        	for (int y=0;y<10;y++)
	        		A[x][y]=input.nextInt();
			
			for (int x=0;x<10;x++)
	        	{
				for (int y=0;y<10;y++)
	        		System.out.print(A[x][y] + " ");
			System.out.println();
	        	}
		
		

	}

}
