package com.dsa;
/*Description: To reverse a number using recursion

Time Complexity: O(log10n) where n is given input number.
*/
public class Reverse{

  //function starts
  private int revNum(int n){
    //base case
    if(n/10==0){
      return n;
    }
    //recursive call
    else{
      return (n%10*10 + revNum(n/10));
    }
  }

//main function
public static void main(String[]args){
   int n=567;
   System.out.println("The reverse of "+n+" is: "+revNum(n));
  }

    /*
    Sample Input:
    n=567

    Output:
    The reverse of 567 is: 765
    */
}
