package ArrayPractice.Hard;

import java.util.Arrays;

class MergeTwoSortedArrays {
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastOfNums1 = m - 1;
        int lastOfNums2 = n - 1;
        int lastIndex = m + n - 1;
        while (lastOfNums1 >= 0 && lastOfNums2 >= 0) {
            if (nums1[lastOfNums1] > nums2[lastOfNums2]) {
                nums1[lastIndex] = nums1[lastOfNums1];
                lastOfNums1--;
            } else {
                nums1[lastIndex] = nums2[lastOfNums2];
                lastOfNums2--;
            }
            lastIndex--;
        }
        while (lastOfNums2 >= 0) {
            nums1[lastIndex] = nums2[lastOfNums2];
            lastOfNums2--;
            lastIndex--;
        }
    }

    public static void main(String[] args) {
        int[] nums1_1 = {1, 2, 3, 0, 0, 0};
        int m1 = 3;
        int[] nums2_1 = {2, 5, 6};
        int n1 = 3;

        merge(nums1_1, m1, nums2_1, n1);
        System.out.println(Arrays.toString(nums1_1));

    }

}
