package Basics.Recursion;

import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print1ton(1,n);
        System.out.println();
        print1tonbacktracking(n);

    }

    private static void print1tonbacktracking(int n) {
        if(n<1) return;
        print1tonbacktracking(n-1);
        System.out.print(n+" ");
    }

    private static void print1ton(int count, int n) {
        if(count>n) return;
        System.out.print(count+" ");
        print1ton(count+1,n);
    }

}
