package ArrayPractice.Easy;

import java.util.Scanner;

public class LongestSubArrayWIthSumK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int target = in.nextInt();
        for(int i=0; i<n; i++) arr[i]=in.nextInt();
        System.out.println(findSubArr(arr,n,target));
    }

    private static int findSubArr(int[] arr, int n, int k) {
        int left=0,right=0;
        int sum =0;
        int len = 0;
        while(right<n){
            sum+=arr[right];
            while(sum>k && left<=right){
                sum-=arr[left];
                left++;
            }
            if(sum == k){
                len = Math.max(len,right-left+1);
            }
            right++;
        }
        return len;
    }
}
