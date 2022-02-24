import java.util.Scanner;

public class P207 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String s1=input.nextLine();
		String s2=input.nextLine();
		
		if (s1.length()!=s2.length())
		{
			System.out.println(0);
			return;
		}
       int R=1;
       for (int x=0;x<s1.length();x++)
    	   if (s1.charAt(x)!=s2.charAt(x))
    	   {
    		   R=0;
    		   break;
    	   }
       System.out.println(R);
		
	}

}
