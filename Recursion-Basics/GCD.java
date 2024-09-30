/*Description: Find GCD(greatest common factor) of a number using Euclidean algorithm.
  Time complexity: O(log(max(a, b)) where a and b are the two numbers.
  */
package com.dsa;
public class Gcd{
  //function call
  private int gcd(int a,int b){
    //base case
    if(b==0){
      return a;
    }
    //recursive call
    return gcd(b,a%b);
  }

  //main function
  public static void main(String[] args){
    int a=12;
    int b=8;
    System.out.print("Gcd of "+a+"and "+b"is "+ gcd(a,b));
  }
}
/*
Sample input:
  a=12
  b=8
Output:
  Gcd of 12 and 8 is 4
  */
    
    
  
