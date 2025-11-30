package Basics.Math;

import java.util.Scanner;

public class GCDorHCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(gcd(a,b));
    }

    private static int gcd(int a, int b) {
        while(a!=0 && b!=0){
            if(a>b) a%=b;
            else b%=a;
        }
        if(a==0) return b;
        else return a;
    }
}
