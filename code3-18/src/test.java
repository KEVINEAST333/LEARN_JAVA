
public class test {
    public static void main(String[] args) {
//        int a = 100;
//        for(int i = 0;i < 101;i++) {
//            int rand =(int) (Math.random() * a);
//            System.out.println(rand);
//    }
        int x = 0;
        int y = 0;
        while(x < 5) {
//            y = y + 2;
//            if (y > 4) {
//                y = y - 1;
//            }
            if (y < 5) {
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }
            }
            y = y + 2;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
