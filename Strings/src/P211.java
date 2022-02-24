import java.util.Scanner;

public class P211 {

	public static void main(String[] args)
	{
	Scanner input=new Scanner (System.in);
	String s1=input.nextLine();
	String s2=input.nextLine();
	 String s3=input.nextLine();
	 String R="";
	 
	 for ( int x=0;x<s1.length();x++)
	 {
		 R=R+s1.charAt(x);
			
		 for (int y=0;y<s3.length();y++)
			 if (s1.charAt(x+y)==s2.charAt(y))
			 {
		    	 	R=R+s3.charAt(y);			 
			 }
 }
System.out.print(R);	 
	 
	 
	 
	}
}
