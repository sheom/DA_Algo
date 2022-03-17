/*
Sum of evens!
Problem Description

You are given an integer A, you need to find and return the sum of all the even numbers between 1 and A.

Even numbers are those numbers that are divisible by 2.
*/

public class Solution {
    private int evenSum(int a){
        if(a == 0){
            return a;
        }
        return a + evenSum(a-2);
    }

    public int solve(int A) {

        if(A%2 == 0 ){
            return evenSum(A);
        }else{
            return evenSum(A-1);
        }
    }
}
