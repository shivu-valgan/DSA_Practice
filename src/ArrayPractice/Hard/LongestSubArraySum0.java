package ArrayPractice.Hard;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArraySum0 {
    public static void main(String[] args) {
        int[] nums = {15, -2, 2, -8, 1, 7, 10, 23};
        int maxLen = findMaxLen(nums);
        System.out.println(maxLen);
    }

    private static int findMaxLen(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0;
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i=0; i<n; i++){
            sum+=nums[i];
            if(sum == 0) max = i+1;
            else{
                if(mpp.containsKey(sum)){
                    max = Math.max(max, i-mpp.get(sum));
                }
                else {
                    mpp.put(sum,i);
                }
            }
        }
        return max;
    }
}
