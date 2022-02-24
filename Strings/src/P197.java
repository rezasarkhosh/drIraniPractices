import java.util.Scanner;

public class P197 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String s=input.nextLine();
		for (int x=0;x<s.length();x++)
		{
			int m=s.charAt(x);
			  
	    	   if ( m == 32)
	    		   System.out.print(" ");
			if (m>=97 && m<=122)
				System.out.print(s.charAt(x));
			if (m>=65 && m<=90)
			    System.out.print((char)(m+32));
			
			
		}
		
		
		
		
	}

}
