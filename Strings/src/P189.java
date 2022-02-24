import java.util.Scanner;

public class P189 {

	public static void main(String[] args) {
     Scanner input=new Scanner (System.in);
       String s=input.nextLine();
       int sum=0;
       int count=0;
       for (int x=0;x<s.length();x++)
       {
    	   char c=s.charAt(x);
    	   if (c>=48 && c<=57)
    	   {
    		   sum+=c;
    		   count++;
    	   }	   
       }
      
       int Y=sum/count;
       char x= (char)(Y);
       System.out.println(x);
     
     
     
     
     
     

	}

}
