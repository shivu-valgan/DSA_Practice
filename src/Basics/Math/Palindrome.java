package Basics.Math;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPal(n));
    }

    private static boolean isPal(int n) {
        return n == reverseNumber(n);
    }

    public static int reverseNumber(int n) {
        int rev=0;
        while(n!=0){
            int rem = n%10;
            rev = rev*10+rem;
            n/=10;
        }
        return rev;
    }
}
