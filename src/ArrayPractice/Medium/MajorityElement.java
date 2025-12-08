package ArrayPractice.Medium;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=in.nextInt();
        int ele = findMajorityEle(arr);
        System.out.println(ele);
    }

    private static int findMajorityEle(int[] arr) {
        int cnt=0;
        int ele=arr[0];
        for(int it: arr){
            if(cnt==0) ele=it;
            if(ele==it)cnt++;
            else cnt--;
        }
        return ele;
    }
}
