package ArrayPractice.Medium;

import java.util.HashMap;
import java.util.Map;

public class TotalSubArrayWithSumK {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        int count = totalSubArrays(nums,k);
        System.out.println(count);
    }

    private static int totalSubArrays(int[] nums, int k) {
        int count = 0;
        Map<Integer,Integer> prefix = new HashMap<>();
        int presum = 0;
        prefix.put(0,1);
        for(int i=0; i<nums.length; i++){
            presum+=nums[i];
            int diff = presum - k;
            if(prefix.containsKey(diff)){
                count+=prefix.get(diff);
            }
            prefix.put(presum,prefix.getOrDefault(presum,0)+1);
        }
        return count;
    }
}
