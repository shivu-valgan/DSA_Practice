package ArrayPractice.Hard;

import java.util.HashMap;
import java.util.Map;

public class CountSubArraysXorK {
    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(countSubArrays(nums,k));
    }

    private static int countSubArrays(int[] nums, int k) {
        Map<Integer,Integer> preXor = new HashMap<>();
        int xor = 0;
        int count = 0;
        preXor.put(0,1);
        for(int num: nums){
            xor^=num;
            int target = k^xor;
            if(preXor.containsKey(target)){
                count+= preXor.get(target);
            }
            preXor.put(xor, preXor.getOrDefault(xor,0)+1);
        }
        return count;
    }
}
