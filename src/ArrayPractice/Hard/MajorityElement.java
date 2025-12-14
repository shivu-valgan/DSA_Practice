package ArrayPractice.Hard;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        List<Integer> majors = findMajorityElements(nums);
        System.out.println(majors);
    }

    private static List<Integer> findMajorityElements(int[] nums) {
        int cnt1=0, cnt2=0, ele1=Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        List<Integer> majors = new ArrayList<>();
        for(int num: nums){
            if(cnt1 == 0 && ele2!=num){
                cnt1++;
                ele1 = num;
            }
            else if(cnt2 == 0 && ele1!=num){
                cnt2++;
                ele2 = num;
            }
            else if(ele1 == num){
                cnt1++;
            }
            else if(ele2 ==num){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        int count1=0;
        int count2=0;
        for(int num : nums){
            if(ele1==num){
                count1++;
            }
            else if(ele2 == num){
                count2++;
            }
        }
        int threshold = nums.length/3;
        if(count1>threshold) majors.add(ele1);
        if(count2>threshold) majors.add(ele2);
        return majors;
    }
}
