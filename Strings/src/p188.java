import java.util.Scanner;

public class p188 {

	public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
       String s=input.nextLine();
       for (int x=0;x<s.length();x++)
       {
    	   char c=s.charAt(x);
    	   if ( c == 32)
    		   System.out.print(" ");
    	   if (c>=65 && c<=90 )
    		   System.out.print((char)(c +32));
    	   if (c>=97 && c<=122 )
    		   System.out.print((char)(c -32)); 
    	  
    	   
    	   
       }
		
		
		
		
	}


	}


