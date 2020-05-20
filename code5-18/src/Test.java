
public class Test {
    //只能实现单字符切割。
    public static String[] split (String str,String spl){
        int N  = 0;
        int K = 0;
        char[] chars = new char[str.length()];
        char[] spls = new char[spl.length()];
        String[] result = new String[10];
        for(int i = 0;i < str.length();i++) {
            chars[i] = str.charAt(i);
        }
        for(int j = 0;j < spl.length();j++) {
            spls[j] = spl.charAt(j);
        }
        for(int i = 0;i < str.length();i++) {
            for(int j = 0; j < spls.length;j++) {
            if(chars[i] != spls[j]) {
                if (result[N] == null) {
                    result[N] = String.valueOf(chars[i]);
                    break;
                } else  {
                    result[N] = result[N] + String.valueOf(chars[i]);
                    break;
                }

            } else {
                K++;
                if(K < spls.length) {
                    i++;
                }
            }
            }
            if(K == spls.length ) {
                N++;
                K = 0;
            }
        }
        int len = length(result);
        String[] result2 = new String[len];
        convertr(result,result2);
        return result2;
    }
    private static void convertr(String[] result, String[] result2) {
        for (int i = 0; i < result2.length;i++) {
            result2[i] = result [i];
        }
    }

    public static int length(String[] s ) {
        int i = 0;
        while(s[i] != null) {
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        String s = "dalfsfasfsfa";
        String[] a = split(s,"f" );
        for (int i = 0;i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("=========");
        String[] b = s.split("f");
        for (int i = 0;i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
