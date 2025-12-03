package ArrayPractice.Easy;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=in.nextInt();
        int ele = in.nextInt();
        System.out.println(linearSearch(arr,n,ele));
}

    private static int linearSearch(int[] arr, int n, int ele) {
        for(int i=0; i<n; i++){
            if(arr[i]==ele) return i;
        }
        return -1;
    }
}
