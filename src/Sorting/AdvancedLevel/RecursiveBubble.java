package Sorting.AdvancedLevel;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBubble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=in.nextInt();
        bubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int n) {
        if(n==1) return;
        boolean didSwap = false;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                didSwap = true;
            }
            System.out.println("runs");
        }
        if(!didSwap) return;
        bubbleSort(arr,n-1);
    }
}
