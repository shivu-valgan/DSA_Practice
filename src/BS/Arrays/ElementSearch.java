package BS.Arrays;

public class ElementSearch {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) high = mid-1;
            else low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int idx = search(nums,target);
        System.out.println(idx);
    }
}
