package com.dsa;
/*Description: Binary search using recursion.
  Time complexity: O(logn) where n is the size of array.
  */
public class BinarySearch{
  //function call
  private static int binarysearch(int[]arr,int beg,int end,int x){
    while(beg<=end){
      int mid=(beg+end)/2;
      if(arr[mid]==x){
        return mid;
      }
      if(x<arr[mid]){
       return binarysearch(arr,beg,mid-1,x);
      }
      return binarysearch(arr,mid+1,end,x);
    }
    return -1;//if element not found
  }

  //main function
  public static void main(String[]args){
    int[] arr={2,4,6,5,8};
    int x=4;
    System.out.print(x + " is found at index: "+binarysearch(arr,0,arr.length-1,x));
  }
}
/*Sample input:
arr={2,4,6,5,8}
x=4

Output:
4 is found at index:  1
*/
