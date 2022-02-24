import java.util.Scanner;

public class P185 {

	public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
       int n=input.nextInt();
       String s=""; 
       while (n>0)
       {
    	   if (n%16 < 10)
    		   s=n%16 + s;
    	   else
    		   s=(char)((n%16)+55) + s;
    	   n=n/16;
       }
       System.out.println(s);

		
		
		

	}

}
