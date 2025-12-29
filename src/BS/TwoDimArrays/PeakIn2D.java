package BS.TwoDimArrays;

import java.util.Arrays;

public class PeakIn2D {
    public static int[] findPeakGrid(int[][] mat) {
        int low = 0 , high = mat.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            int col = maxIdx(mat[mid]);
            int top = Integer.MIN_VALUE;
            int bottom = Integer.MIN_VALUE;
            if(mid-1>=0) top = mat[mid-1][col];
            if(mid+1<mat.length) bottom = mat[mid+1][col];
            if(mat[mid][col]>top && mat[mid][col]>bottom) return new int[]{mid,col};
            else if(mat[mid][col]<top) high = mid-1;
            else low = mid+1;
        }
        return new int[]{-1,-1};
    }
    private static int maxIdx(int[] arr){
        int idx =-1, max =Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                idx = i;
                max = arr[i];
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[][] mat = {{70,50,40,30,20},{100,1,2,3,4}};
        int[] ans = findPeakGrid(mat);
        System.out.println(Arrays.toString(ans));
    }
}
