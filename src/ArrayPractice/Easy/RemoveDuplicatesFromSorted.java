package ArrayPractice.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=in.nextInt();
        removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void removeDuplicates(int[] arr) {
        int uniqueIdx=0;
        for(int i=1; i<arr.length; i++){
            if(arr[uniqueIdx]!=arr[i]){
                uniqueIdx++;
                arr[uniqueIdx]=arr[i];
            }
        }
    }
}
