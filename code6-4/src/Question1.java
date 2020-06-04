import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        //读入一个字符串输出最长的数字串
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String s = "";
            int size = 0;
            int length = 0;
            String str = scanner.nextLine();
            Queue<Character> queue = new LinkedList<>();
            ArrayList<Character> arrayList = new ArrayList<>();
            for (int i = 0;i < str.length();i++) {
                queue.offer(str.charAt(i));
            }
            while (!queue .isEmpty()) {
                if(Character.isDigit(queue.peek())) {
                    arrayList.add(queue.peek());
                    s += queue.poll();
                }else {
                   size = arrayList.size();
                    if (size != 0) {
                        s += "A";
                        arrayList.clear();
                    }
                    queue.poll();
                }
            }
            System.out.println(s);
            String [] str2 = s.split("A");
            s = "";
            for(int i = 0;i < str2.length;i++) {
                if(str2[i].length() > length) {
                     length = str2[i].length();
                     s = str2[i];
                }
            }
            System.out.println(s);
            s = "";
        }
    }
}
