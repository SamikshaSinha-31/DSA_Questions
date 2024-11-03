/* Problem number: 796. Rotate String
  Problem statement: Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
  */
//code
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        return (s+s).contains(goal);
    }
   public static void main(String[]args){
       String s="abcde";
       String goal="abced";
       System.out.print(rotateString(s,goal));
   }
}

/*Sample input:
 s="abcde"
 goal="abced"

 Output:
 false
   */
