
/**
 这道题就是一道典型的动态规划问题了，思路和背包问题差不多，m就相当于背包能容纳的重量了，就是从右往左校验，通过m，以及m-n进行下一次

 也就是当前是printList(m,n)那接下来就是进行printList(m,n-1)和printList(m-n,n-1)进行递归

 而终止条件是n<=0，以及m<0(m<0说明在上一次递归调用是减的n（相对于当前应该为n+1）是减多了，为负)，m==0时候说明正好找到，打印

 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int up = n > m ? m : n;
            printList(m, up, arrayList);
            //System.out.println(arrayList);
        }
    }

    private static void printList(int m, int n, ArrayList<Integer> arrayList) {
        if(m == 0) {
            for (int i = arrayList.size() -1; i >= 0; i --) {
                System.out.print(arrayList.get(i));
                System.out.print(" ");
            }
            System.out.println();

            return;
        }
        if(n <= 0 || m < 0) {
            return;
        }
        ArrayList<Integer> arrayList1 = new ArrayList<>(arrayList);
        printList(m , n -1,arrayList);
        arrayList1.add(n);
        printList(m - n, n -1,arrayList1);
    }
}
