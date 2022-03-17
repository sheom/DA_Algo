/*
Print all primes less than or equal to n
You will be given an integer n. You need to print all the prime numbers less than or equal to n in the ascending order.
Input: The input will be in the following format :
1. The first line should be the value of n.


Output: The output should be of the following format
1. In the first line print all the prime numbers less than or equal to n in ascending order.
Note: If there are no primes less than or equal to n then print “There are no prime numbers less than n”.

*/

import java.lang.*;
import java.util.*;

public class Main {
    int primeCounter = 0;
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<2){
            System.out.print("There are no prime numbers less than or equal to "+ n );
        }else{
            for (int i=2; i<=n; i++){
                isPrime(i);
            }
        }
    }

    public static void isPrime(int a) {
        int num = a;
        int d = 2;

        while(d < num ){
            if(num % d == 0 ){
                return;
            }
            d++;
        }

        if(d==num){
            System.out.print(num+" ");
        }

    }


}
