package Sorting.AdvancedLevel;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveInsertion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=in.nextInt();
        insertionSort(arr,0,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr,int i, int n) {
        if(i==n) return;
        int j=i;
        while(j>0 && arr[j]<arr[j-1]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;

            j--;
        }
        insertionSort(arr,i+1,n);
    }
}
