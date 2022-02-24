package arrays;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) // مرتب کردن اعداد گرفتته شده از کاربر
	{
		Scanner input=new Scanner (System.in);
		System.out.println(" لطفا طول آرایه خود را وارد کنید" );
		int n=input.nextInt();
		int A[]=new int[n];
	    for  (int x=0;x<n;x++)
	    { 
	    	System.out.println( " لطفا عدد "+ x + " ام را وارد کنید");
	    	A[x]=input.nextInt(); 
	    }
           for(int x=0;x<=n-1;x++)
           {
        	   int p=x;
        	for(int y=x+1;y<=n-2;y++)   
        	
        		if (A[y]<A[p]) {
        			p=y; 
        	       int temp=A[x];
                	A[x]=A[p];
        	        A[p]=temp;
        	        }
                     }
           for (int x=0;x<n;x++)
        	   System.out.print(A[x] + " ");
	                   }
 
                         }
