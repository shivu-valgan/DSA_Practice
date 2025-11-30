package Basics.Recursion;

import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(fib(n));
    }

    private static int fib(int n) {
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
}
