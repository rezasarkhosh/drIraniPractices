import java.util.Scanner;

public class tmm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		for (int x=0;x<s.length();x++)
			for (int y=x+1;y<s.length();y++)
				System.out.println(s.charAt(x)+s.charAt(y));
		
		

	}

}
