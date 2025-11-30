package Basics.Recursion;

import java.util.Scanner;

public class Ntimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printName(n);
    }

    private static void printName(int n) {
        if(n<1) return;
        System.out.println("Hello");
        printName(n-1);
    }
}
