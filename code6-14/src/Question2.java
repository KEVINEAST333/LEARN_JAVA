import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String[] array = s.split(" ");
            for (int i = 0; i < array.length; i++) {
                set.add(array[i]);
                }
            }
        System.out.println(set.size());
        }

    }
