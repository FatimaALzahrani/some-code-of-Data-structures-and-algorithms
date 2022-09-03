/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * ظپط§ط·ظ…ط© ظ…ط­ظ…ط¯ |F42
 *طھظ‚ظ„ط¨ ط§ظ„ط¬ظ…ظ„ظ‡
 */
import java.util.*;

public class ReverseString {
static String Recursive_ReverseStr(String str){
    //ط§ط°ط§ ظƒط§ظ† ط¹ط¯ط¯ ط§ظ„ط§ط­ط±ظپ ط§ظ‚ظ„ ظ…ظ† ظˆط§ط­ط¯ ظٹط¹ظ†ظٹ ظ…ط§ ظƒط§ظ† ظپظٹظ‡ ط§ط­ط±ظپ ط§طµظ„ط§ ط±ط¬ط¹ ظˆظ„ط§ط´ظٹ
if (str.length()<1) return "";
    //ط§ط°ط§ ظƒط§ظ† ط¹ط¯ط¯ ط§ظ„ط§ط­ط±ظپ ط§ظƒط«ط± ظ…ظ† ظˆط§ط­ط¯
 else 
    //ط±ط¬ط¹ ظ‚ظٹظ…ط© ط§ط®ط± ط­ط±ظپ  ظƒط§ظˆظ„ ط­ط±ظپ ظˆط§ط±ط¬ط¹ ظ‚ط§ط±ظ† ظˆط¬ظٹط¨ ط§ظ„ظ„ظٹ ظ‚ط¨ظ„ظ‡ ظƒط«ط§ظ†ظٹ ط­ط±ظپ ط©ظ‡ظƒط°ط§
 return str.charAt(str.length()-1) + Recursive_ReverseStr(str.substring(0,str.length()-1));
}
//ط¨ط§ظ„ظپظˆط± ظ„ظˆط¨
static String nonRecursive_reverseStr(String str){
    //ظ‚ظٹظ…ط© ط§ظپطھط±ط§ط¶ظٹظ‡ ظˆظ„ط§ط´ظٹ
String result = "";//NADA
//ط§ظ„ط´ط±ط· ظٹظƒظˆظ† ط§ظ‚ظ„ ظ…ظ† ط¹ط¯ط¯ ط§ظ„ط§ط­ط±ظپ ط¹ط´ط§ظ† ظٹظ…ط± ط¹ظ„ظٹظ‡ط§ ظƒظ„ظ‡ط§
for (int i = 0; i < str.length(); i++) 
    //ط®ظ„ ظ‚ظٹظ…ط© ط§ظ„ظ†ط§طھط¬ ظ‡ظٹ ط§ظ„ط­ط±ظپ ط§ظ„ظ„ظٹ ط¹ظ†ط¯ ط§ظٹ ظˆط§ظ„ط±ظٹط²ظ„طھ
    result = result+str.charAt(i);//DAN
return result;
}
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
System.out.print("Enter the String for reverse:   ");
String s1 = scanner.nextLine();//ط§ط¯ط®ط§ظ„ ط§ظ„ظ…ط³طھط®ط¯ظ…

System.out.println();
String s2 = Recursive_ReverseStr(s1);
System.out.println(" the string after reverse using a recursive method  "+s2); 

System.out.println();
 s2 = nonRecursive_reverseStr(s1);
System.out.println(" the string after reverse using non recursive method  "+s2); 

    }
}
