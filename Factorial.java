/*
Find Factorial!
Write a program to find the factorial of the given number A.
*/

public class Solution {
    public int fact(int n){
        if(n==1){
            return 1;
        }else{
         return n * fact(n-1);   
        }
    }
    public int solve(int A) {
        return fact(A);
    }
}
