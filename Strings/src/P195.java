import java.util.Scanner;

public class P195 {

	public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	String s=input.nextLine();
	int n=input.nextInt();
	for (int x=0;x<s.length();x++)
	{
		if (s.charAt(x)==s.charAt(n))
	         System.out.println(s.charAt(x));	
		
	}
	

	}

}
