import java.sql.SQLOutput;

class Text1 {
//     private int a = 10;
//     public void fun() {
//         this.a = 20;
//     }
    public int a;
    public int b;

    public Text1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Text1{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
public class Text {
    public static void main(String[] args) {
        Text1 test1 = new Text1(10,20);
        System.out.println(test1);
    }

}
