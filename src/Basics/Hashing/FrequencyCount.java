package Basics.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=in.nextInt();
        countfreq(arr);
    }

    private static void countfreq(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele: arr){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        map.forEach((k,v)->{
            System.out.println(k+"->"+v);
        });
    }
}
