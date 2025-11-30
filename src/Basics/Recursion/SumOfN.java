package Basics.Recursion;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sumOfFirstN(n));
    }

    private static int sumOfFirstN( int n) {
        if(n==1) return 1;
        return n+sumOfFirstN(n-1);
    }
}
