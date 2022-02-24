import java.util.Random;
import java.util.Scanner;

public class P181 {

	public static void main(String[] args) {
		 Random random1 = new Random ();
		Scanner input=new Scanner (System.in);
		
		/* 
		 * char c=input.next().charAt(0);
		char c1=(char)(c-32);
		 if ((char)(c1)>=65)
		 System.out.println(c1); 
		 */
		for (int x=0;x<17;x++)
			{
			int n=(int)(Math.random()*8+2);
			 System.out.println(n);
			}
			 
	}

}
