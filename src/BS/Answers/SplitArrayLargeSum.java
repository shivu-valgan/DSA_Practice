package BS.Answers;

public class SplitArrayLargeSum {
    public static int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int high = 0;
        for(int num: nums){
            high+=num;
            low = Math.max(low,num);
        }

        while(low<=high){
            int mid = low+(high-low)/2;
            if(possibleSplits(nums,mid,k)) high = mid-1;
            else low = mid+1;
        }
        return low;
    }

    private static boolean possibleSplits(int[] nums, int mid, int k){
        int sum = 0,splits=1;
        for(int i=0; i<nums.length; i++){
            if(sum+nums[i]<=mid){
                sum+=nums[i];
            }
            else {
                splits++;
                sum = nums[i];
            }
            if(splits>k) return false;
        }
        return k==splits;
    }

    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(arr,k));
    }
}
