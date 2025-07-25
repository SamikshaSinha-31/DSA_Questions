/*Problem Number: 68. Text Justification
Problem Statement: Given an array of strings words and a width maxWidth, format the text such that each line has exactly maxWidth characters and is fully (left and right) justified.
You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly maxWidth characters.
Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line does not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.
For the last line of text, it should be left-justified, and no extra space is inserted between words.

Note:
A word is defined as a character sequence consisting of non-space characters only.
Each word's length is guaranteed to be greater than 0 and not exceed maxWidth.
The input array words contains at least one word.
 
Example 1:
Input: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
Output:
[
   "This    is    an",
   "example  of text",
   "justification.  "
]
Example 2:
Input: words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
Output:
[
  "What   must   be",
  "acknowledgment  ",
  "shall be        "
]
Explanation: Note that the last line is "shall be    " instead of "shall     be", because the last line must be left-justified instead of fully-justified.
Note that the second line is also left-justified because it contains only one word.*/
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int start = 0;
        while (start < words.length) {
            int width = words[start].length(), letters = width, end = start;
            while (end + 1 < words.length && width + 1 + words[end + 1].length() <= maxWidth) {
                width += 1 + words[++end].length();
                letters += words[end].length();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(words[start++]);
            if (end == words.length - 1 || start > end) {
                while (start <= end) {
                    sb.append(' ');
                    sb.append(words[start++]);
                }
                while (sb.length() < maxWidth) sb.append(' ');
            } else {
                int base = (maxWidth - letters) / (end - start + 1);
                int bonus = (maxWidth - letters) % (end - start + 1);
                while (start <= end) {
                    for (int i = 0; i < base; i++) sb.append(' ');
                    if (bonus-- > 0) sb.append(' ');
                    sb.append(words[start++]);
                }
            }
            res.add(sb.toString());
        }
        return res;
    }
}
