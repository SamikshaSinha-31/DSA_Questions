package com.dsa;
/*Description:To print the sum of first N natural numbers using recursion.

  Time Complexity: O(N) where N is the given number.
  */
public class SumOfN{
  //calling function
private static int sum(int N){
  //base case
  if(N==0 || N==1){
    return N;
  }
    //recursive call
   return (sum(N-1)+N);
}

//main function
public static void int main(String[]args){
  int N=10;
  int s=sum(N);
  System.out.print("Sum of first "+ N +" natural numbers is: "+ s);
}
}

/*Sample input:
N=10

Output:
Sum of first 10 natural numbers is: 55
  */
