import java.math.BigInteger;

public class Question2 {
    public static String AddLongInteger(String addend,String augend) {
        BigInteger bigInteger1 = new BigInteger(addend);
        BigInteger bigInteger2 = new BigInteger(augend);
        BigInteger bigInteger = bigInteger1.add(bigInteger2);
        String result = String.valueOf( bigInteger);
        return result;
    }
    public static void main(String[] args) {
       String result =  AddLongInteger("231242141221412","2321313123123211231");
        System.out.println(result);
    }

}
