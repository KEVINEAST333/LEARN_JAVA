package Work;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static int[][] shiftGrid(int[][] grid, int k) {
        Queue<Integer> queue =new LinkedList<>();
        int h = grid.length-1;
        int l = grid[0].length-1;
         k = k % (h * l);
        for(int i = h;i >= 0 ;i--) {
            for(int j = l;j >= 0; j--) {
                queue.offer(grid[i][j]);
            }
        }
        for(int m = 0;m < k;m++) {
            queue.offer(queue.poll());
        }
        for(int i = h;i >= 0 ;i--) {
            for (int j = l; j >= 0; j--) {
                if (!queue.isEmpty()) {
                    grid[i][j] = queue.poll();
                }
            }
        }

        return grid;
    }
    public static void main(String[] args) {

        int [][] array  = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 1;
        int [][] array2 = shiftGrid(array,k);
        System.out.println();
    }
}
