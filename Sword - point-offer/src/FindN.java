public class FindN {
    //在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
    // 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
    // 判断数组中是否含有该整数
    public boolean Find(int target, int [][] array) {
        for(int i = 0; i < array.length;i++) {
            int left = 0;
            int right = array[i].length - 1;
            int mid = 0;
            while(left <= right) {
                mid = left + (right - left)/2;
                if(array[i][mid] < target) {
                    left = mid + 1;

                } else if (array[i][mid] > target) {
                    right = mid - 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] [] array = new int[2][4];
        System.out.println(array.length);
    }
}
