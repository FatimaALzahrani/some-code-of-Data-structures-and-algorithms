/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * ظپط§ط·ظ…ط© ظ…ط­ظ…ط¯ |F42
 * ظٹط´ظˆظپ ط§ط°ط§ ط§ظ„ط¬ط²ط، ط§ظ„ظٹظ…ظٹظ† ظˆط§ظ„ظٹط³ط§ط± ظ†ظپط³ ط§ظ„ط´ظٹ
 */
import java.util.Scanner;

public class PalindromeCheck {
public static int[] countdown(int num) {
    // write your code here
    int Array[]=new int[num];
      int Array2[]=new int[num];
  for(int i=0;num==0;i++){
   Array[i]=num-3;
    num-=3;
  }
  for(int j=0;j<Array.length;j++){
    if(Array[j]%2==0){
    Array2[j]=Array[j];
    }
  }  
  return Array2;
}
    public static void main(String[] args) {
        countdown(10);
    }
}
