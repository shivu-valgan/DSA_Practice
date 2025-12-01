package Sorting.BasicLevel;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=in.nextInt();
        bubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int n) {
        for(int i=0; i<n; i++){
            boolean didSwap = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap=true;
                }
            }
            if(!didSwap) break;
        }
    }
}
