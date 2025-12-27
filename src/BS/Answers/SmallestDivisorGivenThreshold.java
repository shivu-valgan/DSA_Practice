package BS.Answers;

public class SmallestDivisorGivenThreshold {
    public static int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = -1;
        for(int num:nums){
            high = Math.max(high,num);
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            if(sumOfD(mid,nums,threshold)) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    private static boolean sumOfD(int divisor, int[] nums,int threshold){
        int sum=0;
        for(int ele: nums){
            sum+=((ele+divisor-1)/divisor);
            if(sum>threshold) return false;
        }
        return sum<=threshold;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 6;
        System.out.println(smallestDivisor(nums,threshold));
    }
}
