
public class P281 {

	public static void main(String[] args)
	{
	int n=-23;
	int m=11;
	int p=0;
	p=Min(m , n);
    System.out.println(p);
	}
	public static int Min(int x , int y)
	{
		int R=0;
		if (x<y)
			R=x;
		else
			R=y;
		return R;
	}

}
