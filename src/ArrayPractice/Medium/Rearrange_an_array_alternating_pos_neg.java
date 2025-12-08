package ArrayPractice.Medium;

import java.util.Arrays;

public class Rearrange_an_array_alternating_pos_neg {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int[] ans = alternateArr(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] alternateArr(int[] arr) {
        int pos = 0;
        int neg = 1;
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                ans[pos]=arr[i];
                pos+=2;
            }
            else {
                ans[neg] = arr[i];
                neg+=2;
            }
        }
        return ans;
    }
}
