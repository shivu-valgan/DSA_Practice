package ArrayPractice.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        List<Integer> leaders= findLeaders(arr);
        System.out.println(leaders);
    }

    private static List<Integer> findLeaders(int[] arr) {
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for(int j=arr.length-1; j>=0; j--){
            if(arr[j]>max){
                max=arr[j];
                list.add(arr[j]);
            }
        }
        return list;
    }
}
