package ArrayPractice.Hard;

public class MaxProdSubarr {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        int ans = findMaxProd(nums);
        System.out.println(ans);
    }

    private static int findMaxProd(int[] nums) {
        long prefix = 1;
        long suffix = 1;
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
            prefix *= nums[i];
            suffix *= nums[n-i-1];
            max = Math.max(max,Math.max((int)prefix,(int)suffix));
        }
        return max;
    }
}
