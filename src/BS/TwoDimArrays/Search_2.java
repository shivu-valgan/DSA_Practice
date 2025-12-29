package BS.TwoDimArrays;

import java.util.Arrays;

public class Search_2 {
    public static int[] searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int n = matrix.length;
        int row = 0, col = m-1;
        while(row<n && col>=0){
            int ele = matrix[row][col];
            if(ele == target) return new int[]{row,col};
            else if(ele>target) col--;
            else row++;
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] mat = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        int[] ans = searchMatrix(mat,target);
        System.out.println(Arrays.toString(ans));
    }
}
