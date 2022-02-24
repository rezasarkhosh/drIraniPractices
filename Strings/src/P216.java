import java.util.Scanner;

public class P216 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String s=input.nextLine();
		int cA=0;
		String A[]=new String[100];
		String R="";
		String B[]=new String [100];
		int cB=0;
		for (int x=0;x<s.length();x++)
		{
			for (int y=x+1;y<s.length();y++)
				if(s.charAt(x)==s.charAt(y))
					{
					A[cA++]=R+s.charAt(x);
					R="";
					}
       }
		for (int x=0;x<cA;x++)
		{
			for (int y=x+1;y<cA;y++)
				if(A[x]==A[y])
					{
					B[cB++]=A[x];
				}
		}
		for (int x=0;x<cB;x++)
		  System.out.println(B[x]);
	}

}
