package com.dsa;
/*Description: To find the maximum element in an array using recursion.

Time Complexity: O(N),where N is the size of array.
*/
public class MaxElmnt{ 

  //function starts
  private static int maxInArray(int[] arr,int n){
    //base case
    if(n==1){
      return arr[0];
    }
    //recursive call
    else{
      return (Math.max(arr[n-1],maxInArray(arr,n-1)));
    }
  }

//main function
public static void main(String[]args){
   int[] arr={2,5,4,6,8};
   int n=arr.length;
   System.out.println("Maximum element of the array is: " + maxInArray(arr,n));
  }

    /*
    Sample Input:
    arr={2,5,4,6,8}
    n=5

    Output:
    Maximum element of the array is: 8
    */
}
