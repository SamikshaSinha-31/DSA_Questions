/*Description: To find the sum of digits of a number
  Time complexity:O(logn) where n is the given number
  */
package com.dsa;
public class sum_of_digits{
//function starts
  private int sum(int n){
    //base case
    if(n==0){
      return 0;
    }
    //recursive call
    return sum(n%10 + sum(n/10));
  }

  //main function
  public static void main(String[]args){
    int n=123;
    int s=sum(n);
    System.out.print("Sum of digits of" + n + "is " + a);
  }
}

/*Sample input:
  n=123
  Output:
  Sum of digits of 123 is 6
  */

