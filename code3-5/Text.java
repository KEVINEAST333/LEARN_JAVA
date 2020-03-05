public class Text{
public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		while (i <= 100) {
			sum += i;//sum = sum+i;
			i++;
		}
		System.out.println(sum);
		 i = 2;
		
			while (i <= 100) {
			sum1 += i;//sum = sum+i;
			i+=2;
		}
		System.out.println(sum1);

		//计算1-100偶数的和
		 i = 1;
		
			while (i <= 100) {
			sum2 += i;
			i+=2;
		}
		System.out.println(sum2);
		
		//计算1-100奇数的和
	}
}