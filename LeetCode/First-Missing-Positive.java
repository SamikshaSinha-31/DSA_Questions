/*Problem No.: 41: First Missing Positive
Problem statement: Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.

Example 2:
Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array, but 2 is missing.*/

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        boolean contains1=false;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                contains1=true;
            }
            if(nums[i]<=0 || nums[i]>n){ //[1,n]
                nums[i]=1;
            }
        }
        if(!contains1)  return 1;
        for(int i=0;i<n;i++){
            int num=Math.abs(nums[i]);
            int idx=num-1;
            if(nums[idx]<0) continue;
            nums[idx]=-nums[idx];
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0) return i+1;
        }
        return n+1;
    }
}
