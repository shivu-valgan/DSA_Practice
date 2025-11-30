package Basics.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)  arr[i]=in.nextInt();
        reverseArray(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr,int start, int end) {
        if(start>=end) return;
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end] = temp;
        reverseArray(arr,start+1,end-1);
    }

}
