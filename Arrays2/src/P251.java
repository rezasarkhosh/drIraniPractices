import java.util.Scanner;

public class P251 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int A[][]=new int [3][3];
		for (int x=0;x<3;x++)
        	for (int y=0;y<3;y++)
        		A[x][y]=input.nextInt();
		
		for (int x=0;x<3;x++)
        	{
			for (int y=0;y<3;y++)
        		System.out.print(A[x][y] + " ");
		System.out.println();
        	}
	
	
	
	
	
	}

}
