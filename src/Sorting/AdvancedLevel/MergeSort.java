package Sorting.AdvancedLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=in.nextInt();
        mergeSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {
        int mid = (low+high)/2;
        if(low==high) return;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        List<Integer> temp = new ArrayList<>();

        while(left<=mid && right<=high){
            if(arr[left]<arr[right]) temp.add(arr[left++]);
            else temp.add(arr[right++]);
        }
        while (left<=mid) temp.add(arr[left++]);
        while (right<=high) temp.add(arr[right++]);

        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }

    }
}
