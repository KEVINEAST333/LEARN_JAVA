public class TextDome {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a = " + a , + "b = " + b);
		
	}// swap two numbers
	
	public static void main(String args[]) {
		int max = 0;
		int min = 0;
		int a = 10;
		int b = 50;
		int c = 30;
		if (a >= b && a >= c)
		{
			max = a;
			 if(b <= c)
			 {
				 min = b;
				
			 }
			 else
			 {
                min = c;
			 }
	}
	if (b >= a && b >= c)
		{
			max = b;
			 if(a <= c)
			 {
				min = a; 
			 }
			  else
			  {
				min = c;
			  }
		
	}
	if (c >= b && c >= a)
		{
			max = c;
			 if(a <= b)
			 {
				 min = a; 
			 }
			 else
			 {
				 min = b; 
			 }
		
	}
	             System.out.println("max = " + max);
				 System.out.println("min = " + min);
	}
	// 三个数找出最大和最小。 
}
