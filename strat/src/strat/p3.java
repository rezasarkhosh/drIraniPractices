package strat;

import java.util.Scanner;

public class p3 { // خودپرداز

	public static void main(String[] args)
	{
		Scanner input=new Scanner (System.in);
		int n=input.nextInt();
		int R=0;
		int C=0;
		int E=0;
		int T=0;
		while (n>=50) {
		 R=n/50+R;
		 n=n%50;
		}
		System.out.println("50" + "=" + R);
		while (n>=10)
		{	C=n/10+C;
		  n=n%10;
		}
        System.out.println("10" + "=" + C);
         while (n>=5)
         {
        	 E=n/5+E;
        	 n=n%5;
         }
	System.out.println("5" + "=" + E);
	 while (n>=1)
	 {
		 T=n/1+T;
		 n=n%1;	 
	 }
	 System.out.println("1" + "=" + T);
	
	} //end of main
}//end of class
