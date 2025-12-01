package Sorting.BasicLevel;

import java.util.Arrays;
import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=in.nextInt();
        selectionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr,int n) {
        for(int i=0; i<n; i++){
            int minIdx=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minIdx]) minIdx=j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
}
