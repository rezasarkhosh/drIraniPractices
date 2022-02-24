import java.util.Scanner;

public class P212 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String s=input.nextLine();
		char spliter=input.next().charAt(0);
		String A[]=new String[100];
		int cA=0;
		String temp="";
		for (int x=0;x<s.length();x++)
		{
			if (s.charAt(x)==spliter)
			{
				A[cA++]=temp;
				temp="";
			}
			else 
				temp=temp+s.charAt(x);
		}
		A[cA++]=temp;
		
		for (int x=0;x<cA;x++)
			System.out.println(A[x]);
		

	}

}
