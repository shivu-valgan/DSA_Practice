package Basics.Math;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(isArmStrong(n)) System.out.println("The Number is Armstrong: "+n);
        else System.out.println("The Number is Not Armstrong: "+n);
    }

    private static boolean isArmStrong(int n) {
        int sum=0,num=n;
        int count = String.valueOf(n).length();
        while(n!=0){
            int rem = n%10;
            sum+=Math.pow(rem,count);
            n/=10;
        }
        return sum==num;
    }
}
