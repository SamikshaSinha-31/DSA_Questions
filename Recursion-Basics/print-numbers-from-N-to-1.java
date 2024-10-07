package com.dsa;
/*Description:To print numbers from N to 1 using recursion.

  Time Complexity: O(N) where N is the given number.
  */
public class Print{
  //calling function
private static void printNTo1(int N){
  if(N>0){
    //recursive call
    System.out.print(N+" ");
    print1ToN(N-1):
  }
  else{
  return ;}
}

//main function
public static void int main(String[]args){
  int N=5;
  printNTo1(N);
}
}

/*Sample input:
N=5

Output:
5 4 3 2 1
  */
