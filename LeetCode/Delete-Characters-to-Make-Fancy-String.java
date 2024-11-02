/*Problem Number: 1957. Delete Characters to Make Fancy String
  Problem statement: A fancy string is a string where no three consecutive characters are equal.

Given a string s, delete the minimum possible number of characters from s to make it fancy.

Return the final string after the deletion. It can be shown that the answer will always be unique.

Example 1:

Input: s = "leeetcode"
Output: "leetcode"
Explanation:
Remove an 'e' from the first group of 'e's to create "leetcode".
No three consecutive characters are equal, so return "leetcode".
  */
//code
class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        int cnt=1;
        for(int i=1;i<s.length();i++){
           if(s.charAt(i)==ans.charAt(ans.length()-1)) {cnt++;
           if(cnt<3) ans.append(s.charAt(i));}
           else {
            cnt=1;
            ans.append(s.charAt(i));
           }
        }
        return ans.toString();
    }
  public static void main(String[]args){
  String s="aaabaaaa";
    System.out.print(makeFancyString(String s));
  }
}

/*
Sample input: 
 s="aaabaaaa"
output:
"aabaa"
*/
