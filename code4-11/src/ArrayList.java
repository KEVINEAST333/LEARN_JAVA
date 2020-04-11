import java.util.Collection;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();
        Collection<Integer> collection = new java.util.ArrayList<>();
        list.add("你");
        list.add("在");
        list.add("干");
        list.add("吗");
        System.out.println(list.toString());
        System.out.println(list.equals("干"));
        collection.add(20);
        System.out.println(collection.toString());
    }
}
