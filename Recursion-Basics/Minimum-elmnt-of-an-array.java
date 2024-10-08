package com.dsa;
/*Description: To find the minimum element in an array using recursion.

Time Complexity: O(N),where N is the size of array.
*/
public class MinElmnt{ 

  //function starts
  private static int minInArray(int[] arr,int n){
    //base case
    if(n==1){
      return arr[0];
    }
    //recursive call
    else{
      return (Math.min(arr[n-1],minInArray(arr,n-1)));
    }
  }

//main function
public static void main(String[]args){
   int[] arr={2,5,4,6,8};
   int n=arr.length;
   System.out.println("Minimum element of the array is: " + minInArray(arr,n));
  }

    /*
    Sample Input:
    arr={2,5,4,6,8}
    n=5

    Output:
    Minimum element of the array is: 2
    */
}
