package arrays;

public class p156 {

	public static void main(String[] args) {
	int A[]=new int[20];
	int x=0;
	int r=(int)(Math.random()*10+1);
	for (int z=1;z<20;z++)
	{
		int t=(int)(Math.random()*10+1);
		for (int y=0;y<z;y++)
		     if (A[y]!=t)
		    	 A[z]=t;
	}
	for (int u=0;u<20;u++)
		System.out.println(A[u]);
	}

}
