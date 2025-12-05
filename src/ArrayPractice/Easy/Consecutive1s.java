package ArrayPractice.Easy;

import java.util.Scanner;

public class Consecutive1s {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=in.nextInt();
        int maxConsecutive1 = findMaxConsecutive1(arr,n);
        System.out.println(maxConsecutive1);
    }

    private static int findMaxConsecutive1(int[] arr, int n) {
        int count =0;
        int max = 0;
        for(int ele : arr){
            if(ele == 1) count++;
            else count = 0;
            max = Math.max(max,count);
        }
        return max;
    }
}
