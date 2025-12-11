package ArrayPractice.Medium;

import java.util.Arrays;

public class RotateMatrixBy90 {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        transpose(matrix);
        reverseEveryRow(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    private static void reverseEveryRow(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n; i++){
            int left = 0 , right = n-1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    private static void transpose(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
