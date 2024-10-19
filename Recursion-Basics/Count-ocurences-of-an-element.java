package com.dsa;
/*Description: To the number of ocurences of an element in an array.
  Time Complexity: O(n) where n is the number of elements of the array.
  */
public static int countOccurrences(int[] arr, int target, int index) {
  //base case
        if (index == arr.length) {
            return 0;
        }

        int count = 0;
        if (arr[index] == target) {
            count = 1;
        }
  //recursive call
        return count + countOccurrences(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 2, 4};
        int target = 2;

        int count = countOccurrences(arr, target, 0);
        System.out.println("Occurrences of " + target + ": " + count);
    }
}
/* Sample input:
  arr = [1, 2, 3, 2, 1, 2, 4]
  target = 2

  Output:
  Occurrences of 2 : 3
  */
