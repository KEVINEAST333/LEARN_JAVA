import java.lang.reflect.Field;

public class TestString {
    public static void main(String[] args) {
        String str1 = "haha";
//        String str2 = new String("haha").intern();
//        System.out.println(str1 == str2);
//        System.out.println(str1.equals(str2));
        char [] array = str1.toCharArray();
        for(int i = 0;i < str1.length();i++) {
            System.out.println(str1.charAt(i));
        }
    }
}
