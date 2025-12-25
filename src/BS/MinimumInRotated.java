package BS;

public class MinimumInRotated {
    public static int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int low = 0, high = nums.length-1;
        while(low<=high){
            if(nums[low]<=nums[high]){
                min = Math.min(min,nums[low]);
                break;
            }
            int mid = (low+high)/2;
            if(nums[low]<=nums[mid]){
                min = Math.min(min,nums[low]);
                low = mid+1;
            }
            else{
                min = Math.min(min,nums[mid]);
                high = mid-1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }
}
