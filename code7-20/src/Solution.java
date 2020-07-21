import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        int n = 5;
        int m = 5;
        List<Integer> list = new ArrayList<>();

        int up = n > m ? m : n;

        printList(m, up, list);
    }

    /**
     *
     * @param m
     *            剩些的能减去的数
     * @param n
     *            遍历的树列中的最大，从1，2，3...n右往左校验
     * @param list
     */
    public static void printList(int m, int n, List<Integer> list)
    {
        if (m == 0)
        {
            System.out.println(list);
            return;
        }

        if (n <= 0 || m < 0)
        {
            return;
        }

        List list1 = new ArrayList<>(list);
        printList(m, n - 1, list);

        list1.add(n);
        printList(m - n, n - 1, list1);

    }
}

