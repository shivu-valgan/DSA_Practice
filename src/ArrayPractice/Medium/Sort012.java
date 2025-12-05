package ArrayPractice.Medium;

import java.util.Arrays;


public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {2,1,1,1,2,2,0,0,1,0,2};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort012(int[] arr) {
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else {
                swap(arr,mid,high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


}
