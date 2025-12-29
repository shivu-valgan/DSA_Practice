package BS.TwoDimArrays;

public class RowWithMaxOnes {
        public static void main(String[] args) {
            int[][] matrix = {{1, 1, 1}, {0, 0, 1}, {0, 0, 0}};
            int n = 3, m = 3;
            System.out.println("The row with maximum no. of 1's is: " + rowWithMax1s(matrix, n, m));
        }


    private static int rowWithMax1s(int[][] matrix, int n, int m) {
            int cnt_max = 0;
            int idx = -1;
            for(int i=0; i<n; i++){
                int cnt = m - lowerBound(matrix[0],0);
                if(cnt>cnt_max){
                    cnt_max= cnt;
                    idx = i;
                }
            }
            return idx;

    }
    private static int lowerBound(int[] nums, int target) {
        int ans = nums.length;
        int low = 0;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid = (low + high)/2;
            if(nums[mid]>=target){
                ans = mid;
                high = mid-1;
            }
            else low = mid + 1;
        }
        return ans;
    }
}
