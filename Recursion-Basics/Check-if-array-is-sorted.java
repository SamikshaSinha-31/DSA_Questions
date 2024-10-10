package com.dsa;
/*Description: To check if array is sorted using recursion.
  Time Complexity: O(n) 
  */
static boolean arraySortedOrNot(int a[], int n)
    {
          // base case
        if (n == 1 || n == 0)
            return true;
    
          
          // check if present index and index 
        // previous to it are in correct order
        // and rest of the array is also sorted
        // if true then return true else return
        // false
        return a[n - 1] >= a[n - 2]
            && arraySortedOrNot(a, n - 1);
    }

    // Driver code
    public static void main(String[] args)
    {

        int arr[] = { 20, 23, 23, 45, 78, 88 };
        int n = arr.length;
        
          // Function Call
        if (arraySortedOrNot(arr, n))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
/*Sample input: 
  arr[] = { 20, 23, 23, 45, 78, 88 }

Output:
Yes
  */
