/* Problem number and name: 2938. Separate Black and White Balls
  Problem statement:There are n balls on a table, each ball has a color black or white.

You are given a 0-indexed binary string s of length n, where 1 and 0 represent black and white balls, respectively.

In each step, you can choose two adjacent balls and swap them.

Return the minimum number of steps to group all the black balls to the right and all the white balls to the left.

 

Example :

Input: s = "101"
Output: 1
Explanation: We can group all the black balls to the right in the following way:
- Swap s[0] and s[1], s = "011".
Initially, 1s are not grouped together, requiring at least 1 step to group them to the right.

Constraints:

1 <= n == s.length <= 105
s[i] is either '0' or '1'.
*/

class Solution {
    public long minimumSteps(String s) {
        long swap=0;
        long black=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                black++;
            }
            if(s.charAt(i)=='0'){
                swap+=black;
            }
        }
        return swap;
    }
    
  public static void main(String[]args){
    String s=new String("1101");
    long ans=minimumSteps(s);
    System.out.print("Minimum number of steps are:"+ans);
  }
}

/* Sample input: 
  s=1101

  Sample output:
  Minimum number of steps are:2
  */
