public class WeAreHappy {
    //请实现一个函数，将一个字符串中的每个空格替换成“%20”。
    // 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
    public static String replaceSpace(StringBuffer str) {
        //1.投机
       String res =  str.toString().replaceAll(" ","%20");
       return res;
    }
    public static String replaceSpace2(StringBuffer str) {
        //2.替换
        for(int i = 0;i < str.length();i++) {
            char c = str.charAt(i);
            if(c == ' ') {
                str.deleteCharAt(i);
                str.insert(i,"%20");

            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
    }
}
