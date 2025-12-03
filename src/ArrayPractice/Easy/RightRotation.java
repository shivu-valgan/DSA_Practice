package ArrayPractice.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=in.nextInt();
        int rotations = in.nextInt();
        rightRotateOptimal(arr,n,rotations);

        System.out.println(Arrays.toString(arr));
    }

    private static void rightRotateOptimal(int[] arr, int n, int rotations) {
        rotations = rotations %n;
        reverseArray(arr,0,n-1);
        reverseArray(arr,0,rotations-1);
        reverseArray(arr,rotations,n-1);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while(start<=end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
