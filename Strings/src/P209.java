import java.util.Scanner;

public class P209 {

	public static void main(String[] args) {
		  Scanner input=new Scanner (System.in);
		  String s=input.nextLine();
		  char c=input.next().charAt(0);
		  for (int x=0;x<s.length();x++)
		  {
			  if (s.charAt(x)==c)
			  {
				System.out.print("");  		
			  }
			  else
				  System.out.print(s.charAt(x));
			  
			  
			  
		  }
		  
		  

	}

}
