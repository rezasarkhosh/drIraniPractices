import java.util.Scanner;

public class P215 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String s1=input.nextLine();
		String s2=input.nextLine();
		int count=0;
		
		for (int x=0;x<s1.length();x++)
		{
			int flag=-1;
			for (int y=0;y<s2.length();y++)
				if(s1.charAt(x+y)!=s2.charAt(y))
				{
					flag=0;
					break;
				}
				if (flag==-1)
					count++;
			
		}
		System.out.print(count);
		
		
		
		
	}

}
