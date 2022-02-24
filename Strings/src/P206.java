import java.util.Scanner;

public class P206 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String s=input.nextLine();
		String s2=input.nextLine();
		int n=input.nextInt();
		for (int x=n;x<s.length();x++)
		{
			int flag=-1;
			for (int y=0;y<s2.length();y++)
				if (s.charAt(x+y)!=s2.charAt(y))
				{
					flag=0;
					break;
					
				}
			if (flag==-1)
			System.out.print(x);
		}
		
		
	}

}
