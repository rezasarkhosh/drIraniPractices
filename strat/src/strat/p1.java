package strat;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args)
	{
      Scanner input=new Scanner (System.in);
     System.out.println( "please Enter the day of year For convert that to month:");
      int n=input.nextInt();
      if(n<=31)
    	  System.out.println("1");
      if(n>31 && n<=62)
    	  System.out.println("2");
      if (n>62 && n<=93)
        System.out.println("3");
      if (n>93 && n<=124)
          System.out.println("4");
      if (n>124 && n<=155)
          System.out.println("5");
      if (n>155 && n<=186)
          System.out.println("6");
      if (n>186 && n<=216)
          System.out.println("7");
      if (n>216 && n<=246)
          System.out.println("8");
      if (n>246 && n<=276)
          System.out.println('9');
      if (n>276 && n<=306)
          System.out.println("10");
      if (n>306 && n<=336)
          System.out.println("11");
      if(n>336 && n<=365)
    	  System.out.println("12");
	}

}
