package com.package;
/*Problem Number: 3163. String Compression III
Problem statement: Given a string word, compress it using the following algorithm:

Begin with an empty string comp. While word is not empty, use the following operation:
Remove a maximum length prefix of word made of a single character c repeating at most 9 times.
Append the length of the prefix followed by c to comp.
Return the string comp.

Example 1:
Input: word = "abcde"
Output: "1a1b1c1d1e"
Explanation:
Initially, comp = "". Apply the operation 5 times, choosing "a", "b", "c", "d", and "e" as the prefix in each operation.
For each prefix, append "1" followed by the character to comp.
  */
class Solution {
    public static String compressedString(String s) {
        String comp="";
        int cnt=1;
        char ch=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==ch && cnt<9){
                cnt++;
            }else{
                comp=comp+cnt+ch;
                cnt=1;
                ch=s.charAt(i);
            }
        }comp=comp+cnt+ch;
        return comp;
    }
  public static void main(String[] args){
    String word= "aaaaaaaaaaaaaabb";
    String ans=compressedString(word);
    System.out.print(ans);
  }
}

/*Sample input:  
word= "aaaaaaaaaaaaaabb"
Output: 
"9a5a2b"
  */
