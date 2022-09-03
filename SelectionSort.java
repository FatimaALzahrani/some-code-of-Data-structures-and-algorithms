/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selection_Sort;

import java.util.Scanner;

/**
 *
 * ظپظƒط±طھظ‡ط§ طھظ…ط³ظƒ ط§ظˆظ„ ط¹ظ†طµط± ظˆطھظ‚ط§ط±ظ†ظ‡ ط¨ظƒظ„ ط§ظ„ط¹ظ†ط§طµط± ط§ط°ط§ ظ„ظ‚ظٹطھ ط§طµط؛ط± ظ…ظ†ظ‡ طھط¨ط¯ظ„ظ‡ظ… ط¨ط¨ط¹ط¶ ظˆط§ط°ط§ 
 * ظ…ط§ ظ„ظ‚ظٹطھ ط§طµط؛ط± ظ…ظ†ظ‡ طھط±ظˆط­ ظ„ظ„ط¹ظ†طµط± ط§ظ„ظ„ظٹ ط¨ط¹ط¯ظ‡ ظˆطھظ‚ط§ط±ظ† ط¨ظƒظ„ ط§ظ„ط¹ظ†ط§طµط±
 */
public class SelectionSort {
 int A[];//ط¹ط±ظپطھ ظ…طµظپظˆظپظ‡ ظ„طھط®ط²ظٹظ† ط§ظ„ط¹ظ†ط§طµط±
 int capacity;//ط­ط¬ظ… ط§ظ„ظ…طµظپظˆظپظ‡
 int size;//ط¹ط´ط§ظ† ط§ط°ط§ ط¬ظٹظ†ط§ ظ†ط¶ظٹظپ
 SelectionSort (int c) {//ظƒظˆظ†ط³طھط±ظƒطھط±
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
 
void SelectionSort() {
  int min;//ط§ظ‚ظ„ ظ‚ظٹظ…ط©
  //ظپظˆط± طھظ…ط± ط¹ظ„ظ‰ ظƒظ„ ط§ظ„ظ…طµظپظˆظپظ‡
 for (int i = 0; i < A.length - 1; i++) { //ط¨طھط­ط¯ط¯ ط§ظ„ط¹ظ†طµط± ط§ظ„ظ„ظٹ ط¨ظ†ظ‚ط§ط±ظ† ظپظٹظ‡ ط¨ط§ظ‚ظٹ ط§ظ„ط¹ظ†ط§طµط± ظ„ظ„ط§ط®ظٹط±
    min = i;//ط§ظ‚ظ„ ط¹ظ†طµط± ظٹط³ط§ظˆظٹ ط§ظٹ ظ…ط¨ط¯ط§ظٹط§ط§ظ„ظٹظ† ظ†ظ„ظ‚ط§ ط§طµط؛ط±
    //طھط¨ط­ط« ط¹ظ† ط§طµط؛ط± ط¹ظ†طµط±
 for (int j = i + 1; j < A.length; j++){//طھظ…ط± ط¹ظ„ظ‰ ظƒظ„ ط§ظ„ط¹ظ†ط§طµط± ط¨ط¹ط¯ ط§ظ„ط§ظٹ ظˆطھظ‚ط§ط±ظ†ظ‡ط§ ط¨ظ‡ ظˆط¨ط¹ط¯ ظ…ط§ طھظ…ط± ط¹ظ„ظ‰ ط§ظ„ط¹ظ†ط§طµط± ظ„ظˆ ظ„ظ‚ظٹ ط´ظٹ ط§طµط؛ط± ظ…ظ†ظ‡ ظٹط¨ط¯ظ„ ظ…ط¹ ط§طµط؛ط± ظˆط§ط­ط¯ ظˆط§ط°ط§ ظˆطµظ„ ط§ط®ط± ط¹ظ†طµط± ظٹط·ظ„ط¹ ظ„ظ„ظˆط¨ ط§ظ„ط®ط§ط±ط¬ظٹظ‡ ط¹ط´ط§ظ† ظٹط±ظˆط­ ظ„ظ„ط±ظ‚ظ… ط§ظ„ظ„ظٹ ط¨ط¹ط¯ظ‡ ظˆظ‡ظƒط°ط§ 
  if (A[j] < A [min]){//ط§ط°ط§ ظƒط§ظ† ط§ظ„ط¹ط¯ط¯ ط§ظ„ظ„ظٹ ط¨ط¹ط¯ ط§ظ„ ط§ظٹ ط§ظ‚ظ„ ظ…ظ†ظ‡
    min = j;// ط®ظ„ ط§ظ„ظ…ظٹظ† ظ‡ظˆ ط§ظ„ط¬ظٹ 
  }
 }
 //طھط¨ط¯ظٹظ„ ط¨ظٹظ† ط§ظ„ظ…ظٹظ† ظˆط§ظ„ ط§ظٹ
 int temp = A[i];
 A[i] = A[min];//ط¹ط´ط§ظ† ظ†ط¨ط¯ظ„ ط¨ظٹظ† ط§ظ„ط§ط§طµط؛ط± ظˆط§ظ„ظ„ظٹ ظƒط¨ظٹط±
 A[min] =temp;//ط¹ط´ط§ظ† ظ†ط±ط¬ط¹ ط§ظ„ط¹ط¯ط¯ ط§ظ„ظ„ظٹ ظƒط§ظ† ط§ظƒط¨ط±
 }
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
