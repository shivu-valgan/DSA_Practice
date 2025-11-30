package Basics.Math;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Divisors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printAllDivisors(n);
    }

    private static void printAllDivisors(int n) {
        Set<Integer> set = new TreeSet<>();
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                set.add(i);
            }
        }
        System.out.println(set);
    }
}
