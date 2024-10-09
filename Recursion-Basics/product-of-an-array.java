package com.dsa;
/*Description: To find product of an array using recursion

Time Complexity: O(n) where n is the size of the given array
*/
public class ProductOfArray{

  //function starts
  private int product(int[] arr,int n){
    //base case
    if(n<=0){
      return 0;
    }
    //recursive call
    else{
      return (arr[n-1]*sum(arr,n-1));
    }
  }

//main function
public static void main(String[]args){
   int[] arr={1,2,3,4};
        System.out.println("Product of array is: " + product(arr,arr.length));
  }

    /*
    Sample Input:
    arr={1,2,3,4}

    Output:
    Product of array is:24
    */
}
