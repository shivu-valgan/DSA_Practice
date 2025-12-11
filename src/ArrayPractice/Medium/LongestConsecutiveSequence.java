package ArrayPractice.Medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        int longestSequence = findLongestSequence(nums);
        System.out.println(longestSequence);
    }

    private static int findLongestSequence(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int len = 0;
        for(int it:set){
            if(!set.contains(it-1)){
                int cnt = 1;
                int x = it;
                while(set.contains(x+1)){
                    cnt+=1;
                    x+=1;
                }
                len = Math.max(len,cnt);
            }
        }
        return len;
    }
}
