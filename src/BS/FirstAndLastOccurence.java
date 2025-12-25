package BS;

import java.util.Arrays;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,8,10};
        int target = 8;
        int[] res = searchRange(arr,target);
        System.out.println(Arrays.toString(res));
        int totalOccurences = res[1]-res[0]+1;
        System.out.println("Total occurences of target: "+totalOccurences);
    }
    public static int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;
        int low =0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                first = mid;
                high = mid-1;
            }
            else if (nums[mid]>target) high = mid-1;
            else low = mid+1;
        }
        low = 0; high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                last = mid;
                low = mid+1;
            }
            else if (nums[mid]>target) high = mid-1;
            else low = mid+1;
        }
        return new int[]{first,last};
    }
}
