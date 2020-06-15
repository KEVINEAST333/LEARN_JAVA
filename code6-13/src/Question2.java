import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//BigInteger Map解决每位位数个数问题
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextBigInteger()) {
            Map<BigInteger,BigInteger> map = new HashMap<>();
            BigInteger n = scanner.nextBigInteger();
            BigInteger a = new BigInteger("0");
            BigInteger b = new BigInteger("10");
            BigInteger c = new BigInteger("1");
            while (!n.equals(a)) {
                BigInteger key = n.remainder(b);
                n = n.divide(b);
                if(map.get(key) == null) {
                    map.put(key,c);
                } else {
                    map.put(key,map.get(key).add(c));
                }
            }
            for(int i = 0;i < 10;i++) {
                BigInteger bigInteger = new BigInteger(String.valueOf(i));
                if(map.get(bigInteger) != null) {
                    System.out.println(i + ":" + map.get(bigInteger));
                }
            }
        }
    }
}
