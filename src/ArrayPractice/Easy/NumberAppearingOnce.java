package ArrayPractice.Easy;

import java.util.Scanner;

public class NumberAppearingOnce {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=in.nextInt();
        int numAppearingOnce = findNumAppearOnce(arr,n);
        System.out.println(numAppearingOnce);
    }

    private static int findNumAppearOnce(int[] arr, int n) {
        int xor =0;
        for(int ele : arr){
            xor = xor ^ ele;
        }
        return xor;
    }
}
