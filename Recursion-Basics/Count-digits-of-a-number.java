package com.dsa;
/*Description: To count digits of a number using recursion.

Time Complexity:  O(log10(N)) or O(Number of Digits), where N is the input number.
*/
public class CountDigits{

  //function starts
  private static int count(int n){
    //base case
    if(n/10==0){
      return 1;
    }
    //recursive call
    else{
      return (1+count(n/10));
    }
  }

//main function
public static void main(String[]args){
   int n=234;
   System.out.println("Number of digits in " + n + " is: " + count(n));
  }

    /*
    Sample Input:
    n=234

    Output:
    Number of digits in 234 is: 3
    */
}
