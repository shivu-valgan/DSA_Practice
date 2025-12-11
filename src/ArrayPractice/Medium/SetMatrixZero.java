package ArrayPractice.Medium;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setMatrixZero(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    private static void setMatrixZero(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRowHasZero = false;
        for(int j=0; j<cols; j++){
            if(matrix[0][j]==0){
                firstRowHasZero = true;
                break;
            }
        }
        boolean firstColHasZero = false;
        for(int i = 0; i<rows; i++){
            if(matrix[i][0]==0){
                firstColHasZero = true;
                break;
            }
        }
        for(int i=1; i<rows; i++){
            for(int j=1; j<cols; j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1; i<rows; i++){
            for(int j=1; j<cols; j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstColHasZero){
            for(int i=0; i<rows; i++){
                matrix[i][0] = 0;
            }
        }
        if(firstRowHasZero){
            for(int j=0; j<cols; j++){
                matrix[0][j] = 0;
            }
        }
    }
}
