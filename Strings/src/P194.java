import java.util.Scanner;

public class P194 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String s=input.nextLine();
		int p=0;
		for (int x=0;x<s.length();x++)
			p=p*10+(s.charAt(x)-'0');
		System.out.print(p);
		
		
		
	}

}
