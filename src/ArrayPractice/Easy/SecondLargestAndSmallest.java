package ArrayPractice.Easy;

import java.util.Scanner;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=in.nextInt();
        System.out.println(secondLargestEle(arr,n));
        System.out.println(secondSmallestEle(arr,n));
    }

    private static int secondSmallestEle(int[] arr, int n) {
        int smallest = arr[0];
        int secSmallest = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]<smallest) {
                secSmallest = smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secSmallest && arr[i]!=smallest){
                secSmallest=arr[i];
            }
        }
        return secSmallest;
    }

    private static int secondLargestEle(int[] arr,int n) {
        int greatest = arr[0];
        int secGreatest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>greatest) {
                secGreatest = greatest;
                greatest=arr[i];
            }
            else if(arr[i]>secGreatest && arr[i]!=greatest){
                secGreatest=arr[i];
            }
        }
        return secGreatest;
    }
}
