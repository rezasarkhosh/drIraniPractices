package strat;

public class p73b {

	public static void main(String[] args)
	{
		for (int x=0; x<=10;x++) {
			 for (int y=10;y>x;y--)
				 System.out.print(" ");
			 for (int Y=1;Y<2*x;Y++)
				 System.out.print("*");
			 System.out.println();
			 }
		}
}
