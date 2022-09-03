/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insertion_Sort;

import java.util.Scanner;

/**
 *ظٹط§ط®ط°  ط§ظˆظ„ ط¹ظ†طµط± ظˆظٹظپط±ط¶ ط§ظ†ظ‡ ط§ظ„ط§طµط؛ط± ظˆظٹط¨ط¯ط£ ظٹظ‚ط§ط±ظ† ط§ظ„ظ„ظٹ ط¨ط¹ط¯ظ‡ ط¨ظ‡
 * ط§ط°ط§ ظƒط§ظ† ط§طµط؛ط± ظ†ط¨ط¯ظ„ ظ„ظˆ ط§ظƒط¨ط± ظ†ط±ظˆط­ ظ„ظ„ظٹ ط¨ط¹ط¯
 * 
 */
public class insertion_sort {
 int A[];//ط¹ط±ظپطھ ظ…طµظپظˆظپظ‡ ظ„طھط®ط²ظٹظ† ط§ظ„ط¹ظ†ط§طµط±
 int capacity;//ط­ط¬ظ… ط§ظ„ظ…طµظپظˆظپظ‡
 int size;//ط¹ط´ط§ظ† ط§ط°ط§ ط¬ظٹظ†ط§ ظ†ط¶ظٹظپ
 insertion_sort (int c) {//ظƒظˆظ†ط³طھط±ظƒطھط±
     size=0;
     capacity=c;
  A = new int[capacity];//ط§ظ†ط´ط§طھ ظ…طµظپظˆظپظ‡
}

 int n;
 int Array[]=new int[6];
 void read(){
     Scanner input = new Scanner (System.in);
    // System.out.println("Enter the number of elements you want to write : "); 
    // n =input.nextInt();
     System.out.println("Enter "+(Array.length-1)+" elements");
     for(int i=1;i<Array.length;i++){
     int user_num=input.nextInt();
     Array[i]=user_num;
     }
}
 void write(){
    for(int i=1;i<Array.length;++i)
    System.out.print (Array[i]+" ");
    System.out.println();
 }
 
 void InsertionSort () {
    for (int i = 1; i < Array.length; i++){//ظ†ظ…ط± ط¹ظ„ظ‰ ظƒظ„ ط§ظ„ط¹ظ†ط§طµط±
//ط§ظ„ط§ظٹ ظˆط§ط­ط¯ ط¹ط´ط§ظ† ط§ظˆظ„ ط¹ظ†طµط± ط§ظپطھط±ط¶ظ†ط§ ط§ظ†ظ‡ ط§ظ„ط§ظ‚ظ„ ظپظ…ط§ ط¨ظ†ط´ظٹظƒ ط¹ظ„ظٹظ‡ + ظ…ط§ظپظٹ ط´ظٹ ظ‚ط¨ظ„ ط§ظˆظ„ ط¹ظ†طµط± ط¹ط´ط§ظ† ظ†ظ‚ط§ظ…ظ‡ ط¨ظ‡
      int key = Array[i];
      int j = i-1; //ط§ظ„ظ„ظٹ ظ‚ط¨ظ„ ط§ظ„ط¹ظ†طµط± ط§ظ„ظ„ظٹ ظ†ط¨ط؛ط§ ظ†ط´ظٹظƒ ط¹ظ„ظٹظ‡ ط¹ط´ط§ظ† ظ†ظ‚ط§ط±ظ†ظ‡ظ… ط¨ط¨ط¹ط¶
      while (j >= 0 && Array[j] > key){//ط§ط°ط§ طھط­ظ‚ظ‚ظˆط§ ط§ظ„ط´ط±ط·ظٹظ† ط§ط¯ط®ظ„ (ط¬ظٹ ط§ظƒط¨ط± ظ…ظ† ط§ظˆ ظٹط³ط§ظˆظٹ طµظپط± ظ„ط§ظ† ظ…ط§ظپظٹ ط¹ظ†ط§طµط± ط¨ط§ظ„ط³ط§ظ„ط¨) ط§ظ„طھط¨ط¯ظٹظ„
       Array[j + 1] = Array[j];//ط¨ط¯ظ„ ط¨ظٹظ†ظ‡ ظˆط¨ظٹظ† ط§ظ„ظ„ظٹ ط¨ط¹ط¯ظ‡
       j = j-1;//ط±ط¬ط¹ ظ‚ظٹظ…ط© ط¬ظٹ ط²ظٹ ظ…ط§ ظƒط§ظ†طھ
      }
      Array[j+1] = key; }//ظ†ط­ط· ظ‚ظٹظ…ط© ط§ظ„ط¹ط¯ط¯ ط§ظ„ظ„ظٹ ط¨ط¯ظ„ظ†ط§ ظ…ط¹ظ‡ ظˆطµط§ط± ظپط§ط¶ظٹ ظƒظ‚ظٹظ…ط© ط§ظ„ظƒظٹ
    }
 }



 /*
 void printArray(){//ط·ط¨ط§ط¹ط© ط§ظ„ظ…طµظپظˆظپظ‡
  for (int i=0; i<A.length; ++i) //ظپظˆط± ظ„ظˆط¨ ط¹ط´ط§ظ† ظ†ظ…ط± ط¹ظ„ظ‰ ظƒظ„ ط§ظ„ط¹ظ†ط§طµط±
    System.out.print (A[i]+" ");
    System.out.println();
 }
 void addArray(int item) { //ط§ط¶ط§ظپظ‡ ط¹ظ†طµط±
     A[size] = item;//ظ†ط®ظ„ظٹ ط§ط®ط± ط¹ظ†طµط± ط§ظ„ط¹ظ†طµط± ط§ظ„ط¬ط¯ظٹط¯
     size= size + 1; }//ظ†ط²ظˆط¯ ط¹ظ„ظ‰ ط§ظ„ط­ط¬ظ…
 */
