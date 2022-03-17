/*
Fibonacci Number
Problem Description

Given a positive integer A, write a program to find the Ath Fibonacci number.

In a Fibonacci series, each term is the sum of the previous two terms and the first two terms of the series are 0 and 1. i.e. f(0) = 0 and f(1) = 1. Hence, f(2) = 1, f(3) = 2, f(4) = 3 and so on.

NOTE: 0th term is 0. 1th term is 1 and so on.

*/
import java.lang.*;
import java.util.*;

public class Main {
    public static int fib(int n){
        if(n<=1){
            return n;
        }

        return fib(n-1) + fib(n-2);

    }
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();

        System.out.print(fib(a));
    }
}
