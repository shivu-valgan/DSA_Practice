package BS.Arrays;

import java.util.Arrays;

public class FloorCeil {
    public static int[] findFloorCeil(int[] nums, int target) {
        int n = nums.length;
        int floor = -1;
        int ceil = -1;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(nums[mid]==target) return new int[]{nums[mid],nums[mid]};
            else if(nums[mid]>target){
                ceil = nums[mid];
                high = mid-1;
            }
            else{
                floor = nums[mid];
                low = mid + 1;
            }
        }
        return new int[]{floor,ceil};
    }

    public static void main(String[] args) {
        int[] nums = {2,4,7,9};
        int target = 5;
        int[] res  = findFloorCeil(nums,target);
        System.out.println(Arrays.toString(res));
    }
}
