package Basics.Recursion;

import java.util.Scanner;

public class StringPalCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(palindrome(0,s));
    }

    private static boolean palindrome(int i, String s) {
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        return palindrome(i+1,s);
    }
}
