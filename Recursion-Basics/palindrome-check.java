package com.dsa;
/*Description:To check if a string is palindrome or not.
  Time complexity: O(n) where n is number of characters
  */
public class PalindromeCheck{
  //function call
private static boolean check(String str,int start,int end){
  //base condition
  if(start>=end){
    return true;
  }
  if(str[start]!=str[end]){
    return false;
  }
  //recursive call
  return check(str,start+1,end-1);
}

//main function
public static void main(String[] args){
  String str="MADAM";
  System.out.print("String is palindrome: "+check(str,0,str.length()-1);
}
}

/*Sample input:
str="MADAM"
  
  Output:
String is palindrome:true
  */
