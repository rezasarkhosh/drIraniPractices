import java.util.Scanner;

public class P193 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String s=input.nextLine();
		String R="";
		int n=s.charAt(0);
		if (n>=97 && n<=122)
		{
			System.out.print((char)(n-32));			
		}
		else 
			System.out.print((char)n);
		
		for (int x=1;x<s.length();x++)
		{
			int m=(char)x;
			
			if (m==32)
			{
				char q=s.charAt((x+1)-32);
				R=R+(char)(q-32);
				
			}
				else 
					R=R+s.charAt(x);
		}
           System.out.println(R);
	 
		
		
		
		
		
	}

}
