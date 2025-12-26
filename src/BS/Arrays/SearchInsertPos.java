package BS.Arrays;

public class SearchInsertPos {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 7;
        int pos = findInsertPos(arr,target);
        System.out.println(pos);
    }

    private static int findInsertPos(int[] arr, int target) {
        int ans = arr.length;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) {
                ans = mid;
                high = mid - 1;
            }
            else low = mid+1;
        }
        return ans;
    }
}
