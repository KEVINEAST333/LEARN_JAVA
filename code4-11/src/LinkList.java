import java.util.Collection;
import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        Collection<String> collection = new LinkedList<>();
        collection.add("你");
        collection.add("干");
        collection.add("啥");
        collection.add("呀");
        System.out.println(collection.size());
        System.out.println(collection.toString());
    }
}
