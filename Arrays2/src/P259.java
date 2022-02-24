import java.util.Scanner;

public class P259 {

	public static void main(String[] args) {
		Scanner input=new Scanner  (System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int A[][]=new int[n][m];
		 for (int x=0;x<n;x++)
			  for (int y=0;y<m;y++)
				 A[x][y]=input.nextInt();	
		 for (int x=0;x<n;x++)
		 { 
			 int max=0;
		     for (int y=0;y<m;y++)
		     {
		    	 if (A[x][y]>max)
		    		 max=A[x][y];
		     }
		     System.out.println(max);
		 
		 }

	}

}
