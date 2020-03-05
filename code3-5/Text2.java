public class Text2 {
public static void main(String args[]) {
	
	int n = 3;
	int i = 1;
	int sum = 0;
	while (i <= n) {
		int j = 1;
		int ret = 1;
		while (j <= i) {
			ret = ret*j;
			j++;
			
		}
		sum = sum + ret;
		i++;
		
	}
	System.out.println(sum);
}

}