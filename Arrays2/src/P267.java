import java.util.Scanner;

public class P267 {

	public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	int n=100;
    int A[]=new int[n];
    int iA=0;
    int B[][]=new int[10][10];
	for (int x=0;x<100;x++)
		A[x]=input.nextInt();
	for (int x=0;x<10;x++)
		for (int y=0;y<10;y++)
			B[x][y]=A[iA++];
		
		

	}

}
