package BS.Answers;

public class KthElementInTwoSortedArrays {
    public static int findKthElementOfSortedArrays(int[] nums1, int[] nums2, int k) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+n2;
        int left = k;
        if(n1>n2) return findKthElementOfSortedArrays(nums2,nums1,k);
        int low = Math.max(0,k-n2), high = Math.min(n1,k);
        while(low<=high){
            int mid1 = low+(high-low)/2;
            int mid2 = left-mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if(mid1-1>=0) l1 = nums1[mid1-1];
            if(mid2-1>=0) l2 = nums2[mid2-1];
            if(mid1<n1) r1 = nums1[mid1];
            if(mid2<n2) r2 = nums2[mid2];
            if(l1<=r2 && l2<=r1){
                if(n%2==1) return Math.max(l1,l2);
            }
            else if(l1>r2) high = mid1-1;
            else low = mid1+1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        int k = 5;
        System.out.println(findKthElementOfSortedArrays(a,b,k));
    }
}
