import java.util.Scanner;

public class P205 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String s=input.nextLine();
		char c=input.next().charAt(0);
		int n=input.nextInt();
		int R=-1;
		for (int x=n;x<s.length();x++)
		{
			if (s.charAt(x)=c)
			{
				R=x;
				break;
			}
			System.out.println(R);
			
			
		}
		

	}

}
