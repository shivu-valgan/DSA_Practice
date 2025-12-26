package BS.Arrays;

public class HowManyTimesArrayIsRotated {
    public static int findRotations(int[] nums) {
        int min=Integer.MAX_VALUE;
        int index = 0;
        int low = 0, high = nums.length-1;
        while(low<=high){
            if(nums[low]<=nums[high]){
                if(nums[low]<min){
                    index = low;
                    min = nums[low];
                }
                break;
            }
            int mid = (low+high)/2;
            if(nums[low]<=nums[mid]){
                if(nums[low]<min){
                    index = low;
                    min = nums[low];
                }
                low = mid+1;
            }
            else{
                if(nums[low]<min){
                    index = mid;
                    min = nums[mid];
                }
                high = mid-1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findRotations(nums));
    }
}
