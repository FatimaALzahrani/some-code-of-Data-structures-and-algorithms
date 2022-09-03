/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bubble_Sort;

/**
 *
 * ظپظƒط±طھظ‡ ظٹظ‚ط§ط±ظ† ط§ط®ط± ط¹ظ†طµط± ط¨ط§ظ„ظ„ظٹ ظ‚ط¨ظ„ظ‡ ظ„ظˆ ظƒط§ظ† ط§طµط؛ط± ظ…ظ†ظ‡ ط¨ظٹط¨ط¯ظ„  ظˆظ‡ظƒط°ط§ ط§ظ„ظ‰ ط§ط®ط± ط¹ظ†طµط±
 */
public class SortingArray {
 int A[];//ط¹ط±ظپطھ ظ…طµظپظˆظپظ‡ ظ„طھط®ط²ظٹظ† ط§ظ„ط¹ظ†ط§طµط±
 int capacity;//ط­ط¬ظ… ط§ظ„ظ…طµظپظˆظپظ‡
 int size;//ط¹ط´ط§ظ† ط§ط°ط§ ط¬ظٹظ†ط§ ظ†ط¶ظٹظپ
 SortingArray (int c) {//ظƒظˆظ†ط³طھط±ظƒطھط±
     size=0;
     capacity=c;
  A = new int[capacity];//ط§ظ†ط´ط§طھ ظ…طµظپظˆظپظ‡
}
 void printArray(){//ط·ط¨ط§ط¹ط© ط§ظ„ظ…طµظپظˆظپظ‡
  for (int i=0; i<A.length; ++i) //ظپظˆط± ظ„ظˆط¨ ط¹ط´ط§ظ† ظ†ظ…ط± ط¹ظ„ظ‰ ظƒظ„ ط§ظ„ط¹ظ†ط§طµط±
    System.out.print (A[i]+" ");
    System.out.println();
 }
 void addArray(int item) { //ط§ط¶ط§ظپظ‡ ط¹ظ†طµط±
     A[size] = item;//ظ†ط®ظ„ظٹ ط§ط®ط± ط¹ظ†طµط± ط§ظ„ط¹ظ†طµط± ط§ظ„ط¬ط¯ظٹط¯
     size= size + 1; }//ظ†ط²ظˆط¯ ط¹ظ„ظ‰ ط§ظ„ط­ط¬ظ…
 
 void bubbleSort () {
    for (int i = 0; i <= A.length-1 ; i++){//ظ…ظ† ط§ظˆظ„ ط¹ظ†طµط± ظ„ظ„ط§ط®ظٹط±
       for (int j = A.length-1 ; j>= i+1 ; j--){//ظ†ط³طھط¯ ظ„ظˆط¨ ط¹ظƒط³ظٹط© طھط¨ط¯ط§ ظ…ظ† ط§ظ„ط§ط®ظٹط± ط§ظ„ظ„ظٹ ط¨ظ†ظ‚ط§ط±ظ†ظ‡ 
       if(A[i]<A[j-1]){//ظ„ظˆ ظƒط§ظ† ط§ظ‚ظ„ 
           //طھط¨ط¯ظٹظ„
      int temp=A[j]; 
       A[j] = A[j-1];
      A[j-1] = temp;
       }
      }
    }
 }
}
