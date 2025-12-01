package Basics.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestOrLowestFrequecyElement {
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
        int maxFreq=Integer.MIN_VALUE,maxEle=0;
        int minFreq=Integer.MAX_VALUE,minEle=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int count = entry.getValue();
            int ele = entry.getKey();

            if(count>maxFreq){
                maxFreq=count;
                maxEle=ele;
            }
            if(count<minFreq){
                minFreq=count;
                minEle=ele;
            }

        }
        System.out.println("Highest Frequency element is: "+maxEle);
        System.out.println("Lowest Frequency element is: "+minEle);
    }
}
