import java.util.Scanner;

public class P220 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String s1=input.nextLine();
		String s2=input.nextLine();
		int count=0;
		for (int x=0;x<s1.length();x++)
		{
			for (int y=0;y<s2.length();y++)
			if (s1.charAt(x)==s2.charAt(y))
               System.out.print(s1.charAt(x));
			
			
		}
		
		

	}

}
