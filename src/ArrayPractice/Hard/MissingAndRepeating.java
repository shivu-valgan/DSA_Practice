package ArrayPractice.Hard;

import java.util.Arrays;

public class MissingAndRepeating {
    public static void main(String[] args) {
        int[] arr = {4,3,6,2,1,1};
        int[] res = findMissingAndRepeating(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] findMissingAndRepeating(int[] arr) {
        long n = arr.length;
        long Sn = (n*(n+1))/2;
        long S2n = (n*(n+1)*(2*n+1))/6;
        long s=0,s2=0;
        for(int ele: arr){
            s+=ele;
            s2+= (long)ele*(long) ele;
        }
        long val1 = s-Sn; //x-y
        long val2 = s2-S2n; //x2 - y2 = (x+y)(x-y)
        val2 = val2/val1; // x+y
        long x = (val1 + val2)/2;
        long y = x-val1;
        return new int[]{(int)x,(int)y};
    }
}
