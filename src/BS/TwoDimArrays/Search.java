package BS.TwoDimArrays;

public class Search {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int m = matrix.length, n=matrix[0].length;
        int high = (m*n)-1;
        while (low<=high){
            int mid = (low+high)/2;
            int r=mid/n,c=mid%n;
            if(matrix[r][c]==target) return true;
            else if(matrix[r][c]<target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 23;
        System.out.println(searchMatrix(mat,target));
    }
}
