/*
Find nth Magic Number
Problem Description
Given an integer A, find and return the Ath magic number.

A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.

First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….

*/

public class Solution {

    int magicNumber(int n){
        int p= 5;
        int ans = 0;
        while(n>0){
            int rem = n%2;
            ans = ans + rem*p;
            p = p*5;
            n = n/2;
        }
        return ans;
    }

    public int solve(int A) {
        
        return (magicNumber(A));
    }
}
