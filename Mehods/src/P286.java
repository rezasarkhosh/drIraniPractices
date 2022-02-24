import java.util.Scanner;

public class P286 {

	public static void main(String[] args)
	{
		Scanner input=new Scanner (System.in);
	    System.out.println("لطفا طول ارایه اول را وارد کنید:");
	    int n=input.nextInt();
	    System.out.println("لطفا طول ارایه دوم را وارد کنید:");
	    int m=input.nextInt();
		int A[]=new int[n];
		int cA=0;
		int B[]=new int[m];
		int cB=0;
		for (int x=0;x<n;x++)
			{
			A[x]=input.nextInt();
			cA++;
			}
		for (int x=0;x<m;x++)
			{
			B[x]=input.nextInt();
			cB++;
			}
		int C[]=new int[100];
		int cC=0;
		int iA=0;
		int iB=0;
		int iC=0;
		iC=SortArray(A,cA,B,cB,C);
		for (int x=0;x<iC;x++)
			System.out.print(C[x]+ " ");
		

	}
	public static int SortArray(int A[] , int cA , int B[] , int cB , int C[] )
	{
		int iA=0;
		int iB=0;
		int iC=0;

	while (iA<cA && iB<cB)
	{
		if (A[iA]<B[iB])
			C[iC++]=A[iA++];
			else 
				C[iC++]=B[iB++];
		}
	if (iA==cA)
		for (int x=iB;x<cB;x++)
			C[iC++]=B[x];
	if (iB==cB)
		for (int x=iA;x<cA;x++)
		C[iC++]=A[x];
	return iC;
	}
	
	 

}
