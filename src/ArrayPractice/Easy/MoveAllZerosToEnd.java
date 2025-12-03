package ArrayPractice.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        moveZeroes(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZeroes(int[] arr, int n) {
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                if(i!=j){
                    arr[j] = arr[i];
                    arr[i] = 0;
                }
                j++;
            }
        }
    }
}
