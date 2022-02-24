import java.util.Scanner;

public class P208 {

	public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	String s1=input.nextLine();
	String s2=input.nextLine();
	String R="";
	String D="";
	if (s1.length()!=s2.length())
	{
		System.out.println("برابر نیستند.");
		return;
	}
	for (int x=0;x<s1.length();x++)
	{
		int m=s1.charAt(x);
		   if ( m == 32)
    		   R=R+"";
		if (m>=65 && m<=90)
	          R=R+(char)(m+32);
		else 
			R=R+s1.charAt(x);
		
	}
		System.out.println();
	for (int x=0;x<s2.length();x++)
	{
		int c=s2.charAt(x);
		   if ( c == 32)
    		  D=D+"";
		if (c>=65 && c<=90)
			D=D+(char)(c+32);
		else
			D=D+s2.charAt(x);
	}	
    int W=1;
    for (int x=0;x<R.length();x++)
 	   if (R.charAt(x)!=D.charAt(x))
 	   {
 		   W=0;
 		   break;
 	   }
    System.out.println(W);
}

}
