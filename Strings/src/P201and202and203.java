import java.util.Scanner;
	public class P201and202and203  {

		public static void main(String[] args) {
	    Scanner input=new Scanner (System.in);
	    String s=input.nextLine();
	    int T1=0;
	    int T2=s.length()-1;
	    while(T1<s.length() && s.charAt(T1++)==' ');
	    while(T2>T1 && s.charAt(T2--)==' ');
	    String R="";
	    for (int x=T1-1;x<=T2+1;x++)
	         R=R+s.charAt(x);
	         System.out.print(R);
		}

	}

