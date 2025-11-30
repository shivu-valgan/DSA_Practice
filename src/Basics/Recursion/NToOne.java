package Basics.Recursion;

import java.util.Scanner;

public class NToOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printNto1(n);
        System.out.println();
        backprintNto1(1,n);
    }

    private static void backprintNto1(int i,int n) {
        if(i>n) return;
        backprintNto1(i+1,n);
        System.out.print(i);
    }

    private static void printNto1(int n) {
        if(n<1) return;
        System.out.print(n);
        printNto1(n-1);
    }
}
