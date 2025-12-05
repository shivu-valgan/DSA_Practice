package ArrayPractice.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubArrayWIthSumK_posneg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=in.nextInt();
        int target = in.nextInt();
        System.out.println(findSubArr(arr,n,target));
    }

    private static int findSubArr(int[] arr, int n, int k) {
        int sum =0;
        int maxLen = 0;
        Map<Integer,Integer> prefixSum = new HashMap<>();
        for(int i=0; i<n; i++){
            sum+=arr[i];
            if(sum == k){
                maxLen = i+1;
            }
            int rem = sum - k;
            if(prefixSum.containsKey(rem)){
                int len = i - prefixSum.get(rem);
                maxLen = Math.max(len, maxLen);
            }
            if(!prefixSum.containsKey(sum)){
                prefixSum.put(sum,i);
            }
        }
        return maxLen;
    }
}
