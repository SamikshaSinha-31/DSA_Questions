package com.dsa;
/*Description: To find factorial of a number using recursion

Time Complexity: O(n) where n is the number given
*/
public class Factorial{

  //function starts
  private int fact(int n){
    //base case
    if(n<=1){
      return 1;}
    //recursive call
    else{
      return (n*fact(n-1));
    }
  }

//main function
public static void main(String[]args){
   int ans = fact(5);
        System.out.println("Factorial is: " + ans);
  }

    /*
    Sample Input:
    n=5

    Output:
    Factorial is: 120
    */
}
