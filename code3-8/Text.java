import java.util.Scanner;
public class Text {
public static int text (int x,int y) {
	int max = x >= y ? x : y;
	return max;	
	}
public static int text (int x,int y,int z) {
	
	return text (text(x,y),z);
}
public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt ();
	int b = scan.nextInt ();
	int c = scan.nextInt ();
	int ret = text(a,b,c);
	System.out.println(ret);
	int ret2 = text(a,b);
	System.out.println(ret2);
	//重载


	// public static int fac(int n) {
		// if (n == 1) {
			// return 1;
		// }
		// return n * fac(n-1);
	// }
	// public static void main (String args []) {
		// Scanner scan = new Scanner(System.in);
	    // int a = scan.nextInt ();
		// int b = fac(a);
		// System.out.println(b);
		//用递归求阶乘
	}
}
