public class HomeWork {
    public static void main(String args[]) {
        int[] arr = {1, 2, 1, 2, 3, 4, 4, 7, 5, 5, 7};
        for (int i = 0; i <= (arr.length - 1); i++) {
            int count = 0;
            for (int j = 0; j <= (arr.length - 1); j++) {
                if (arr[i] == arr[j]) {
                    count ++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
    }
}
