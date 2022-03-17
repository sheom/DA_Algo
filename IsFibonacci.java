/*
given an integer N, task is to check whether the given number exist in fibonacci sequence or not.

INPUT
The first line contains an integer, T, denoting the number of test cases.
Next T lines contains an integer, N.

OUTPUT:
For each test case , print “Yes” if the number exists in fibonacci sequence, else print “No”.

*/

import java.lang.*;
import java.util.*;

public class Main {

    static boolean isFib(int n){

        int inputNumber = n;

        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm = 0;
         
        while (thirdTerm < inputNumber)
        {
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }

        if(thirdTerm == inputNumber) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            int n = sc.nextInt();

            if (isFib(n)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }


        
    }
}
