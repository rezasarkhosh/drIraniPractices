import java.util.Scanner;

public class P190 {

	public static void main(String[] args) {
		 Scanner input=new Scanner (System.in);
		 String s=input.nextLine();
	     String R="";
		 for (int x=0;x<s.length();x++)
		 {
			 if ( s.charAt(x)>='0' && s.charAt(x)<='9')
				 continue;
			 else 
				 R=R+s.charAt(x);
		 }
		 System.out.print(R);
		 
		 
		 
		 

	}

}
