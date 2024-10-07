package com.dsa;
/*Description:To print numbers from 1 to N using recursion.

  Time Complexity: O(N) where N is the given number.
  */
public class Print{
  //calling function
private static void print1ToN(int N){
  if(N>0){
    //recursive call
    print1ToN(N-1):
    System.out.print(N+" ");
  }
  else{
  return ;}
}

//main function
public static void int main(String[]args){
  int N=5;
  print1ToN(N);
}
}

/*Sample input:
N=5

Output:
1 2 3 4 5
  */
