package com.dsa;
/*Description: To reverse a string

Time Complexity:O(n) where n is the length of the string
*/
public class Reverse{

  //function starts
  private static void rev(String str){
    //base case
    if(str==null || str.length()<=1){
     System.out.print(str);
    }
    //recursive call
    else{
      System.out.print(str.charAt(str.length()-1));
      rev(str.substring(0,str.length()-1));
    }
   
  }

//main function
public static void main(String[]args){
   String str="Hello";
   System.out.println("Reverse of string "+str+"is:");
   rev(str);
  }

    /*
    Sample Input:
    str=Hello

    Output:
    Reverse of string Hello is:
    olleH
    */
}
