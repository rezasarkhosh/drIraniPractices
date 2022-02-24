import java.util.Scanner;

public class P213 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		int m = 1;
		for (int x = 0; x < s.length(); x++) {
			m = m * 2;
		}
         for (int x=0;x<=m;x++)
         {
      String p="";
      int n=x;
      while(n>0)
      {
    	  p=n%2+p;
    	  n=n/2;
      }
      for(int y=1;y<s.length()-p.length();y++)
    	  p="0"+p;
      for (int y=0;y<p.length();y++)
    	  if(p.charAt(y)=='1')
    		  System.out.print(s.charAt(y));
        	 System.out.println();
 }
	}

}
