import java.util.Scanner;

public class P200 {

	
	public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	String s=input.nextLine();
	int n=input.nextInt();
	int m=input.nextInt();
	String R="";
	for (int x=n;x<=m;x++)
	{
		R=R+s.charAt(x);
	}
	System.out.print(R);
	
	
	
	
}
}

