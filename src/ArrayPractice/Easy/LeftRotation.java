package ArrayPractice.Easy;

import java.util.*;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=in.nextInt();
        int rotations = in.nextInt();
//        leftRotate(arr,n,rotations);
        leftRotateOptimal(arr,n,rotations);

        System.out.println(Arrays.toString(arr));
    }

    private static void leftRotateOptimal(int[] arr, int n, int rotations) {
        rotations = rotations %n;
        reverseArray(arr,0,rotations-1);
        reverseArray(arr,rotations,n-1);
        reverseArray(arr,0,n-1);
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

    private static void leftRotate(int[] arr, int n, int rotations) {
        rotations=rotations%n;
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<rotations; i++){
            temp.add(arr[i]);
        }
        for(int i=rotations; i<n; i++){
            arr[i-rotations]=arr[i];
        }

        for(int i=n-temp.size(); i<n; i++){
            arr[i]=temp.get(i-(n-temp.size()));
        }
    }
}
