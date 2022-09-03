/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * ظپط§ط·ظ…ط© ظ…ط­ظ…ط¯ |F42
 * ط§ظ„ظ…ط¶ط±ظˆط¨
 */
import java.util.*;

public class factorial {	
static int ReccursiveFact(int n){
    //ط§ط°ط§ ظƒط§ظ† ظˆط§ط­ط¯ ط±ط¬ط¹ ظˆط§ط­ط¯
	    if(n==1) return 1;
            ///ط§ط°ط§ ظ…ط§ ظƒط§ظ† ظˆط§ط­ط¯ ط§ط¶ط±ط¨ظ‡ ظپظٹ ط§ط³طھط¯ط¹ط§ط، ط§ظ„ظ…ظٹط«ظˆط¯ 
	    return n*ReccursiveFact(n-1);
	}
//ط¨ط§ظ„ظپظˆط± ظ„ظˆط¨
static int nonRecursiveFact(int n){
    //ط¨ط¹ط±ظپ ظ…طھط؛ظٹط± ظ‚ظٹظ…طھظ‡ ط§ظ„ط§ظپطھط±ط§ط¶ظٹ ظˆط§ط­ط¯ ظ„ط§ظ† ط§ظ„ط¶ط±ط¨ ط¨ظˆط§ط­ط¯ ظ†ظپط³ظ‡
	int f = 1;
        //ط§ظ„ط´ط±ط· ظپظٹ ظ‡ط°ظٹ ط§ظ„ظپظˆط± ط§ظ†ظ‡ ظٹظƒظˆظ† ط§ظƒط¨ط± ظ…ظ† ظˆط§ط­ط¯ ظ„ظˆ ظƒط§ظ† ط§ظ‚ظ„ ظ…ظ† ظˆط§ط­ط¯ ط¹ظ„ظ‰ ط·ظˆظ„ ط¨ظ†ط±ط¬ط¹ظ‡ ظ„ط§ظ† ظ…ط¶ط±ظˆط¨ ظˆط§ط­ط¯ ظ‡ظˆ ظˆط§ط­ط¯
	for(int i = 1; i<n; i++) 
            //ط§ط°ط§ طھط­ظ‚ظ‚ ط§ظ„ط´ط±ط· ط§ط¶ط±ط¨ ط§ظ„ط¹ط¯ط¯ ظپظٹ ظ‚ظٹظ…ط© ط§ظپ
            f *= i;
        //ط§ط°ط§ ط§ط®طھظ„ ط§ظ„ط´ط±ط· ظˆظˆطµظ„ظ†ط§ ظ„ظˆط§ط­ط¯ ط±ط¬ط¹ ظ‚ظٹظ…ط© ط§ظ„ظ…ط¶ط±ظˆط¨
	return f;
	}

public static void main(String[] args) {
int f;
Scanner s = new Scanner(System.in);
System.out.print("enter an integer ");
int n=s.nextInt();
f = nonRecursiveFact(n);
System.out.println("Recursive Factorial of "+n+" = "+f);
f = ReccursiveFact(n);
System.out.println("non Recursive Factorial of  "+n+" = "+f);
    }
}
