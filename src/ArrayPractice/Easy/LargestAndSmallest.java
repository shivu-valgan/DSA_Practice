package ArrayPractice.Easy;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=in.nextInt();
        System.out.println(largestEle(arr,n));
        System.out.println(smallestEle(arr,n));
    }

    private static int smallestEle(int[] arr, int n) {
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]<smallest) smallest=arr[i];
        }
        return smallest;
    }

    private static int largestEle(int[] arr,int n) {
        int greatest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>greatest) greatest=arr[i];
        }
        return greatest;
    }
}
