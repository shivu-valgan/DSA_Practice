package BS.Answers;

public class KthMissingPositiveInteger {
    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        if(arr[0]>k) return k;
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            int missing = arr[mid] - (mid+1);
            if(missing<k) low = mid+1;
            else high = mid-1;
        }
        return low+k;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
    }
}
