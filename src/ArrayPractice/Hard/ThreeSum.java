package ArrayPractice.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        int target = 0;
        List<List<Integer>> triplets = findTriplets(nums,target);
        System.out.println(triplets);
    }

    private static List<List<Integer>> findTriplets(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> triplets = new ArrayList<>();
        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left = i+1 , right = n-1;
            while(left<right){
                long sum = (long)nums[i]+nums[left]+nums[right];
                if(sum==target){
                    triplets.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++; right--;
                    while(left < right && nums[left]==nums[left-1]) left++;
                    while(left < right && nums[right]==nums[right+1]) right--;
                }
                else if(sum < target) left++;
                else right--;
            }
        }
        return triplets;
    }
}
