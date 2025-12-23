package ArrayPractice.Hard;

import java.util.ArrayList;
import java.util.List;

public class CountInversion {
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        System.out.println(mergeSort(a,0,a.length-1));
    }
    private static int mergeSort(int[] arr, int low, int high) {
        int cnt =0;
        int mid = (low+high)/2;
        if(low==high) return cnt;
        cnt+=mergeSort(arr,low,mid);
        cnt+=mergeSort(arr,mid+1,high);
        cnt+=merge(arr,low,mid,high);
        return cnt;
    }

    private static int merge(int[] arr, int low, int mid, int high) {
        int cnt = 0;
        int left = low;
        int right = mid+1;
        List<Integer> temp = new ArrayList<>();

        while(left<=mid && right<=high){
            if(arr[left]<arr[right]) temp.add(arr[left++]);
            else{
                temp.add(arr[right++]);
                cnt += (mid - left + 1);
            }
        }
        while (left<=mid) temp.add(arr[left++]);
        while (right<=high) temp.add(arr[right++]);

        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
        return cnt;
    }
}
