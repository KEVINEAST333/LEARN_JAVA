
import java.math.BigInteger;
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            ArrayList<BigInteger> arrayList = new ArrayList<>();
            int n = scanner.nextInt();
            for(int i = 0;i < n ;i++) {
                arrayList.add(scanner.nextBigInteger());
            }
            Collections.sort(arrayList);
            for (int j = 0 ;j < n ;j++ ) {
                System.out.println(arrayList.get(j));
            }
        }
    }
}
