/*Problem Number: 4. Median of Two Sorted Arrays
Problem Statement: Given two sorted arrays nums1 and nums2 of size m and n respectively, 
return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
  */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] arr=new int[m+n];
        int k=0;
        for(int i=0;i<m;i++){
           arr[k++]=nums1[i];
        }
        for(int j=0;j<n;j++){
            arr[k++]=nums2[j];
        }
        Arrays.sort(arr);
        if((m+n)%2!=0){
           return(double)arr[(m+n)/2];
        }else{
           return(double)(arr[(m+n)/2]+arr[(m+n)/2-1])/2;
        }
       

    }
}
