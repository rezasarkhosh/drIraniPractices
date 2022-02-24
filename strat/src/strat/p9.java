package strat;

public class p9 { // حاصل جمع  اعداد زوج  زیر صد

	public static void main(String[] args) 
	{
		int S=0;
		for (int x=0;x<=100;x=x+2)
			S=x+S;
        System.out.println(S);
	}

}
