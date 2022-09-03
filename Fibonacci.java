/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * ظپط§ط·ظ…ط© ظ…ط­ظ…ط¯ |F42
 *  ظ…طھطھط§ظ„ظٹط© ظٹط³ط§ظˆظٹ ظپظٹظ‡ط§ ط§ظ„ط­ط¯ ظ…ط¬ظ…ظˆط¹ ط§ظ„ط­ط¯ظٹظ† ط§ظ„ط³ط§ط¨ظ‚ظٹظ†
 */
import java.util.Scanner;
public class Fibonacci {
 //ظ…ظٹط«ظˆط¯ طھط³طھط¯ط¹ظٹ ظ†ظپط³ظ‡ط§ ط±ظٹظƒظٹط±ط³ظپ
static int Fibrative (int n){
    //ظ„ظˆ ظƒط§ظ† ط§ظ„ط¹ط¯ط¯ ظˆط§ط­ط¯ ط§ظˆ ط§ط«ظ†ظٹظ† ط±ط¬ط¹ ظˆط§ط­ط¯
if (n == 1 || n == 2) return 1;
else 
    //ظ„ظˆ ظƒط§ظ† ط§ظƒط¨ط± ظ…ظ† ط§ط«ظ†ظٹظ† ط§ط¬ظ…ط¹ ط§ظ„ط¹ط¯ط¯ ط§ظ„ظ„ظٹ ظ‚ط¨ظ„ظ‡ ظˆط§ظ„ظ„ظٹ ظ‚ط¨ظ„ ظ‚ط¨ظ„ظ‡ ط§ظٹ ط§ظ„ط­ط¯ظٹظ† ط§ظ„ط³ط§ط¨ظ‚ظٹظ† 
    //ط¨ط§طھط¯ط¹ط§ط، ط§ظ„ط¯ط§ظ„ظ‡ ظ„ظ†ظپط³ظ‡ط§
return Fibrative(n-1) + Fibrative(n-2);
}
 //ظ…ظٹط«ظˆط¯ طھط³طھط®ط¯ظ… ط§ظ„ظپظˆط± ظ„ظˆط¨ ط§طھ ط±ظٹظƒظٹط±ط³ظپ
static void FibIterative (int n){
    //ط§ط¹ط±ظپ ط«ظ„ط§ط«ظ‡ ظ…طھط؛ظٹط±ط§طھ ظˆظˆط§ط­ط¯ ظٹظƒظˆظ† ظ„ظ„طھط¨ط¯ظٹظ„ ط¨ظٹظ†ظ‡ظ…
int f1=1,f2=1,i=1;
while (i <= n) {
    System.out.print(f1 + " ");
    int sum = f1 + f2;
    f1 = f2;
    f2 = sum;
    i++;
}	
}

public static void main(String arg [])	{ 
Scanner s = new Scanner(System.in);
//ظ†ط·ظ„ط¨ ظ…ظ† ط§ظ„ظ…ط³طھط®ط¯ظ… ظٹط¯ط®ظ„
System.out.println("enter the number ");
//ط§ط®ظ„ظٹ ط§ظ„ظ…ظٹطھط®ط¯ظ… ظٹط¯ط®ظ„
int n=s.nextInt();
/*
System.out.println("ظپظٹط¨ظˆظ†ط§طھط´ظٹ ط¨ط§ط³طھط¯ط¹ط§ط، ط§ظ„ط¯ط§ظ„ظ‡ ظ†ظپط³ظ‡ط§ ظ„ "+n+ " ظ‡ظˆ "+Fibrative(n));
System.out.println("ظپظٹط¨ظˆظ†ط§طھط´ظٹ ط¨ط§ظ„ظپظˆط± ظ„ظˆط¨ ظ„ "+n+ " ظ‡ظˆ "+FibIterative(n));
*/
System.out.println("Recursive Fibonacci of "+n+" = ");
for(int i = 1; i <= n; i++){
  //call Fibonacci function to print sum of last two numbers
System.out.print(Fibrative(i) + " ");
 }
System.out.println("\nnon Recursive Fibonacci of "+n+" = ");
FibIterative(n);
}
}
