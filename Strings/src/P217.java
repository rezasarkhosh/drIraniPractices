import java.util.Scanner;

public class P217 {

	public static void main(String[] args) {
	     Scanner input=new Scanner (System.in);
	     String s=input.nextLine();
	     char spliter= '.';
	     String A[]=new String[1000];
		 int cA=0;
		 String temp="";
		 for (int x=0;x<s.length();x++)
		 { 
			 if (s.charAt(x)!=spliter)
			 { 
				 temp=temp+s.charAt(x);
			 }
			 else
			 {
				 A[cA++]=temp;
			     temp="";
			 }	  
     
		 }
       for (int x=0;x<cA;x++)
    	   for (int y=x+1;y<cA;y++)
    		   if(A[x]==A[y])
    			   System.out.println(A[x]);
	}

}
