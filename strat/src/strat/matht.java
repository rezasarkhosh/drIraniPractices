package strat;

public class matht {

	public static void main(String[] args) {
		   int A[][]=new int [4][4];
			int B[][]=new int [5][3];
			int count=0;
			
				
			for (int x=0;x<=3;x++)
			{
				for (int y=0;y<=3;y++)		
				{
					A[x][y]=0;
				}
			
				}

			System.out.println();
			for (int z=0;z<30;z++)
			{
				int u=(int) (Math.random()*4+0);
				int o=(int) (Math.random()*4+0);
				if (A[u][o] == 0 )
					{
					A[u][o]=(int) (Math.random()*5+4);
					count++;
					}
				if (count == 5) 
	                break;
			}
			int i=0;
			
			 for (int x=0;x<4;x++)
			 {
				 for (int y=0;y<4;y++)
					 {
					 if (i==6)
						 break;
					 if(A[x][y]!=0)
					 {
						 B[i][0]=x;
						 B[i][1]=y;
						 B[i][2]=A[x][y];
						 i++;
					 }
				 
					 }
			 }
		
		for (int x=0;x<=3;x++)
		{ 
		for(int y=0;y<=3;y++)
		{
			System.out.print(A[x][y] + "  ");
		} 
	System.out.println();
		}
		
		System.out.println();
		System.out.println();
		for (int x=0;x<5;x++)
		{ 
		for(int y=0;y<3;y++)
		{
			System.out.print(B[x][y] + "  ");
		} 
	System.out.println();
		}
		int temp;
		int b=3;
		int j=3;
			for (int x=3;x>=0;x--)
			{
				b=3;
				for(int y=0;y<3-x;y++)
				{
					temp=A[x][y];
					A[x][y]=A[b][j];
					A[b][j]=temp;
					b--;
				}
				j--;
			}
			
			
			
			
			
			
			
			
		System.out.println();
		System.out.println();
		for (int x=0;x<=3;x++)
		{ 
		for(int y=0;y<=3;y++)
		{
			System.out.print(A[x][y] + "  ");
		} 
	System.out.println();
		}
		System.out.println();
		System.out.println();
		
			}
	}
