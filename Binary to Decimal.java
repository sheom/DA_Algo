/*
Problem Description
You are given a number A in binary format (Base = 2). You have to print the number in decimal format (Base = 10).
*/

import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);

        long b = sc.nextLong();
        long num =0;
        long base = 1;
        
        long temp = b;
        while (temp > 0) {
            long last_digit = temp % 10;
            temp = temp / 10;
            num += last_digit * base;
            base = base * 2;
        }
        System.out.print(num);
    }
}
