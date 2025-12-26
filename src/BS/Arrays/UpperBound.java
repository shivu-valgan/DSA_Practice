package BS.Arrays;

public class UpperBound {
    public static int upperBound(int[] nums, int target) {
        int ans = nums.length;
        int low = 0;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid = (low + high)/2;
            if(nums[mid]>target){
                ans = mid;
                high = mid-1;
            }
            else low = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 8, 15, 19};
        int target = 9;
        int idx = upperBound(nums,target);
        System.out.println(idx);
    }
}
