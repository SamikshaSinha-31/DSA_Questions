package com.dsa;
/*Description: To find fibonacci sequence using recursion

Time Complexity: O(2^n) where n is the number given
*/
public class Fibonacci{
  //function starts
  private int fib(int n){
    //base case
    if(n==0 || n==1){
      return n;
    }
    //recursive call
      return (fib(n-1)+fib(n-2));
  }

//main function
 public static void main(String[] args) {
        int n = 10; // Change this value to compute a different term
        System.out.println("Fibonacci of " + n + " is: " + fib(n));
    }
    /*
    Sample Input:
    n=10

    Output:
    Fibonacci of 10 is: 0 1 1 2 3 5 8 13 21 34 
    */
}
