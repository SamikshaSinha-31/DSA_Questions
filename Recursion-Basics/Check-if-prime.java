package com.dsa;
/*Description: To check is the number is prime using recursion.
  */
public class CheckPrime{
  //function call
  private static boolean primeOrNot(int x,int i){
    //base case
    if(x<=1){
      return false;
    }
    if(i==1){
      return true;
    }
    if(x%i==0){
      return false;
    }
    return primeOrNot(x,i-1);
  }

  //main function
  public static void main(String[]args){
    int x= 117;
    System.out.print("The number "+x+" is prime: "+ primeOrNot(x,x-1));
  }
}
/*Sample input:
x=117

Output:
The number 117 is prime: false
*/
