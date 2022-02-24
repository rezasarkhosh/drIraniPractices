package arrays;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class p178 {



	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		
		
		
	
	
		int sum=0;
		for (int z=1;z<=100;z++)
		{
				int u=1;
				for (int o=1;o<=z;o++)
					u=z*u;
	
			sum=u+sum;
				
		}
		
	          System.out.print(sum);
	}
}



File f1=new File("D:\\gFiles\\A1.txt");
PrintWriter outfile=new PrintWriter(f1);
outfile.println("میانگین نمرات کلاس:" + u);
outfile.println( "تعداد مردودی:" + F);
outfile.println(" تعداد قبولی:" + T);
outfile.close();


