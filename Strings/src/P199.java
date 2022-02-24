import java.util.Scanner;

public class P199 {

	public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	String s=input.nextLine();
	int n=input.nextInt();
	for (int x=0;x<=n;x++)
		s=" "+s;
   System.out.print(s);
	}

}
