package ArrayPractice.Easy;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=in.nextInt();
        int missingNumber=findMissing(arr,n);
        System.out.println(missingNumber);
    }

    private static int findMissing(int[] arr, int n) {
        int sumOfN = n*(n+1)/2;
        int sum = 0;
        for(int ele: arr){
            sum+=ele;
        }
        return sumOfN-sum;
    }
}
