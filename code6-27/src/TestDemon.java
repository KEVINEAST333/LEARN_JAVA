import java.text.DecimalFormat;

public class TestDemon {
    public static void main(String[] args) {
        double a = 4;
        a = a / 2;
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        System.out.println(decimalFormat.format(a));
    }
}
