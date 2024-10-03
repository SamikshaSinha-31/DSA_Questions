package com.dsa;
/*Description: To find sum of an array using recursion

Time Complexity: O(n) where n is the size of the given array
*/
public class SumOfArray{

  //function starts
  private int sum(int[] arr,int n){
    //base case
    if(n<=0){
      return 0;
    }
    //recursive call
    else{
      return (arr[n-1]+sum(arr,n-1));
    }
  }

//main function
public static void main(String[]args){
   int[] arr={1,2,3,4};
        System.out.println("Sum of array is: " + sum(arr,arr.length));
  }

    /*
    Sample Input:
    arr={1,2,3,4}

    Output:
    Sum of array is:10
    */
}
