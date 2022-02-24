package strat;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) 
	{ 
		Scanner input=new Scanner (System.in);
		int n=input.nextInt();
	      if(n<=31)
	    	  System.out.println(n);
	      if(n>31 && n<=62)
	    	  System.out.println( n-30);
	      if (n>62 && n<=93)
	        System.out.println( n-62);
	      if (n>93 && n<=124)
	          System.out.println(n-93);
	      if (n>124 && n<=155)
	          System.out.println(n-124);
	      if (n>155 && n<=186)
	          System.out.println(n-155);
	      if (n>186 && n<=216)
	          System.out.println(n-186);
	      if (n>216 && n<=246)
	          System.out.println(n-216);
	      if (n>246 && n<=276)
	          System.out.println(n-246);
	      if (n>276 && n<=306)
	          System.out.println(n-276);
	      if (n>306 && n<=336)
	          System.out.println(n-306);
	      if(n>336 && n<=365)
	    	  System.out.println(n-336);
		}
	}
