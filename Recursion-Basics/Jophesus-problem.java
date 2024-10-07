package com.dsa;
/*Description:The task is to choose the person in the initial circle that survives using recursion.

Time Complexity: O(n) where n is the number given
*/
public class Josephus{

  //function starts
  private int josephus(int n,int k){
    //base case
    if(n==1){
      return 0;
    }
    //recursive call
    else{
      return (josephus(n-1,k)+k-1)%n+1;
    }
  }

//main function
 public static void main(String[] args)
    {
        int n = 14;
        int k = 2;
        System.out.println("The chosen place is "
                           + josephus(n, k));
    }

    /*
    Sample Input:
    n=14
    k=2

    Output:
    The chosen place is 13

    */
}
