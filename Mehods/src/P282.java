
public class P282 {

	public static void main(String[] args) {
		float x=(float) 1.3;
		float y=(float) 1.333;
		float p=0;
		p=min(x,y);
		System.out.println(p);
		
		
		
		

	}
   public static float min(float x , float y)
   {
	float r=0;
     if (x<y)
    	 r=x;
     else 
    	 r=y;
	return r;
     
	   
	   
   }
}
