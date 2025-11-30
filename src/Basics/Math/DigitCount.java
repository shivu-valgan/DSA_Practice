package Basics.Math;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println((int)Math.log10(n)+1);
        count(n);
    }
    static void count(int n){
        int cnt=0;
        while(n!=0){
            cnt++;
            n/=10;
        }
        System.out.println(cnt);
    }
}
