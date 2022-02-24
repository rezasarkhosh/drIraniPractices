
public class P283 {

	public static void main(String[] args) {

		int x=233;
		int r=0;
		r=Ghadr(x);
		System.out.println(r);
		
		
		

	}
	public static int Ghadr(int a)
	{
		int A=-1;
		int p=0;
		if (a==0)
			p=0;
		else if (a>0)
			p=a;
		else 
			p=a*A;
		return p;
		
		
		
	}

}
