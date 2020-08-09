public class Test {
    //输出构造最短回文串。
    public static String Huiwen(String str) {
        if(isHuiwen(str)){
            return str;
        } else {
            char[] chars = str.toCharArray();
           /* char[] rev = new char[str.length()];
            for (int i = 0;i < str.length();i++) {
                 rev[i] = chars[i];
            }*/
            for (int i = 0;i < str.length();i++) {
                String string = new String(str);
                for (int j = i;j >= 0;j--) {
                    string = string + chars[j];
                }
                if(isHuiwen(string)) {
                    return string;
                }
            }

        }
        return str;
    }
    public static Boolean isHuiwen(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder stringBuilder1 = new StringBuilder(str);
        stringBuilder1.reverse();
       // System.out.println(stringBuilder);
        //System.out.println(stringBuilder1);
       // System.out.println(stringBuilder1.equals(stringBuilder));

        if(stringBuilder.toString().equals(stringBuilder1.toString()) ) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "";
        System.out.println(Huiwen(str));
    }
}
