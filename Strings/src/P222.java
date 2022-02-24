import java.util.Scanner;

public class P222 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String s=input.nextLine();
		int n=s.length();
		int max=0;
		int min=0;
		for (int x=1;x<=n;x++)
		{
			min=min*10+x;
			max=max*10+(n-x+1);
		}
		for (int x=min;x<=max;x++)
		{
		 int t=x;
		 int A[]=new int[n];
		 int cA=0;
		 while(t>0)
		 {
			 if(t%10<1 || t%10>n)
				 break;
			 A[cA++]=t%10;
			 t=t/10;
	      }
		 if (t!=0)
			 continue;
		 for (int y=0;y<n;y++)
			 for(int z=y+1;z<n;z++)
				 if(A[y]==A[z])
					 continue;
		 t=x;
		 while(t>0)
		 {
			 System.out.print(s.charAt(t%10-1));
			 t=t/10;
		 }
         }
		System.out.println();
		
		
		
	}

}
