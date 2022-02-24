import java.util.Scanner;

public class P187 {

	public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	int p=1;
	int s=0;
	String n=input.next();
	for (int x=n.length()-1;x>=0;x--)
	{
		char c= n.charAt(x);
		if (c>='0' && c<='9' )
		    s=s+p*(c-'0');
	    if (c>='A' && c<='F')
	    	s=s+p*(c-55);
		p=p*16;
	}
	System.out.println(s);
	
	

	}

}
