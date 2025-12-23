package ArrayPractice.Hard;

import java.util.ArrayList;
import java.util.List;

public class ReversePairs {
    public static void main(String[] args) {
        int[] a = {4, 1, 2, 3, 1};
        int n = 5;
        int cnt = mergeSort(a,0,n-1);
        System.out.println(cnt);
    }

    private static int mergeSort(int[] a, int low, int high) {
        int cnt = 0;
        if(low>=high) return cnt;
        int mid = (low + high)/2;
        cnt += mergeSort(a,low,mid);
        cnt += mergeSort(a,mid+1,high);
        cnt += countPairs(a,low,mid,high);
        merge(a,low,mid,high);
        return cnt;
    }

    private static void merge(int[] a, int low, int mid, int high) {
        List<Integer> list = new ArrayList<>();
        int left = low , right = mid+1;
        while(left <= mid && right <= high){
            if(a[left]<a[right]) list.add(a[left++]);
            else list.add(a[right++]);
        }
        while(left<=mid) list.add(a[left++]);
        while(right<=high) list.add(a[right++]);
        for(int i=low; i<=high; i++){
            a[i] = list.get(i-low);
        }
    }

    private static int countPairs(int[] a, int low, int mid, int high) {
        int right = mid+1;
        int cnt = 0;
        for(int i=low; i<=mid; i++){
            while(right<=high && a[i]>a[right]*2) right++;
            cnt += right - (mid + 1);
        }
        return cnt;
    }
}
