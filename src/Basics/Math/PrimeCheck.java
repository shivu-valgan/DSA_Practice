package Basics.Math;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
