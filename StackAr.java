package Stack_Using_Array;
/**
 *
* fatima mohammed|F42
 */
public class StackAr{
 /*ظ…ظ„ط§ط­ط¸ط§طھ:
 stack is full when top == 0
 stack is empty when top = elements.length */
 int elements [];//ط§ط¹ط±ظپ ط§ظ„ظ…طµظپظˆظپظ‡ 
 int top;   // is the index of the cell containing the last elements added to the stack.
 // the constructor is used , to allocates space for the stack
 StackAr(int Alength){//Declarations stack
  top = Alength;//ظ†ط®ظ„ظٹ ظ…ط¤ط´ط± ط§ظ„طھظˆط¨ ظٹط¤ط´ط± ط¹ظ„ظ‰ ط§ط®ط± ط؛ظ†طµط± ظˆظ‡ظˆ ط·ظˆظ„ ط§ظ„ظ…طµظپظˆظپظ‡
  elements = new int[Alength];//ظ†ظ†ط´ط¦ ظ…طµظپظˆظپظ‡ ظˆظ†ط®ظ„ظٹ ط­ط¬ظ…ظ‡ط§ ظٹط³ط§ظˆظٹ ط§ظ„طھظˆط¨ 
 }//stackArray
 
 //ظ…ط§ ظƒطھط¨ظ†ط§ ط¨ط¨ظ„ظƒ ظ„ط§ظ† ط¹ط§ط¯ظٹ ط¨ظٹظƒظˆظ† ط§ظپطھط±ط§ط¶ظٹ ط¨ظٹظƒطھط¨ظ‡ط§
 Boolean isEmpty(){// Note the stack is empty when top = elements.length which is the maxlength
if (top == elements.length) //ط§ط°ط§ ظƒط§ظ† ط§ظ„طھظˆط¨ ظٹط³ط§ظˆظٹ ط·ظˆظ„ ط§ظ„ط§ط±ظٹ ظٹط¹ظ†ظٹ ظƒط§ظ† ظ…ظ„ظٹط§ظ†
return true; 
else return false;
}//method is empty
 
 //ظپط§ظٹط¯ط© ط§ظ„ط¨ظˆط´ طھط¶ظٹظپ ط¹ظ†طµط± ظپظٹ ط§ظ„طھظˆط¨
 //ظ†ظˆط¹ظ‡ط§ ظپظˆظٹط¯ ظ„ط§ظ† ظ…ط§ ط¨طھط±ط¬ط¹ ط´ظٹ ط¨ط³ ط¨طھط¶ظٹظپ ط¹ظ†طµط± ظ„ظ„طھظˆط¨
 void push(int a){ 
 if (top == 0) //ط§ط°ط§ ظƒط§ظ† ط§ظ„طھظˆط¨ ظٹط³ط§ظˆظٹ طµظپط± ظٹط¹ظ†ظٹ ظ‡ظٹ ظ…ظ„ظٹط§ظ†ظ‡ ظ„ط§ظ† ظˆطµظ„ ظ„ط§ط®ط± ط¹ظ†طµط± ظپظٹ ط§ظ„ظ…طµظپظˆظپظ‡
  System.out.println("the Stack is Full  ");
  else elements[--top] = a;//ظ†ط®ظ„ظٹ ط§ظ„طھظˆط¨ ظٹظ†ظ‚طµ ط¹ط´ط§ظ† ظ†ط±ظˆط­ ظ„ظ„ط¹ظ†طµط± ط§ظ„ظ„ظٹ ط¨ط¹ط¯ ظˆط§ظ„ظ†ط§ظ‚طµ ظƒط§ظ†طھ ظ‚ط¨ظ„ ط§ظ„طھظˆط¨ ظپط¨ط¹ط¯ظ…ط§ ظٹط¹ط¨ظٹ ط§ظ„طھظˆط¨ ط¨ظٹظ†ظ‚طµ
}//method push

//ط§ظ„ط¨ظˆط¨ طھط­ط°ظپ ط§ظ„طھظˆط¨ ظˆظ…ط§ظ„ظ‡ط§ ط¨ط§ط±ط§ظ…ظٹطھط± ظ„ط§ظ† ط¨ظ†ط­ط°ظپ
void pop(){   // pop increment the variable top to ignore the last element added to the stack
if (!isEmpty()) //ط§ط°ط§ ظƒط§ظ† ظپظٹظ‡ ط¹ظ†ط§طµط± ظپظٹ ط§ظ„ط§ط±ظٹ ظˆظ…ط§ ظƒط§ظ†طھ ظپط§ط¶ظٹط©
    top++ ;//ظ†ط²ظˆط¯ ط¹ظ„ظ‰ ط§ظ„طھظˆط¨ ظˆط§ط­ط¯
   else System.out.println("Stack is Empty  ");//ط§ط°ط§ ظƒط§ظ†طھ ظپط§ط¶ظٹظ‡ ط§ط·ط¨ط¹ ظ‡ط°ط§
}

int Top(){ // return  the last element added to the stack
if (!isEmpty())//ط§ط°ط§ ظƒط§ظ† ظپظٹ ط§ظ„ط³طھط§ظƒ ط¹ظ†ط§طµط± ظˆظ…ط§ ظƒط§ظ†طھ ظپط§ط¶ظٹط©
    return elements[top]; //ط±ط¬ط¹ ط§ط¹ظ„ظ‰ ظ‚ظٹظ…ط© ظپظٹ ط§ظ„ط³طھط§ظƒ
     else {//ط§ط°ط§ ظƒط§ظ†طھ ظپط§ط¶ظٹظ‡
    System.out.println("Stack is Empty  ");//ط§ط·ط¨ط¹ ظ„ظ„ظ…ط³طھط®ط¯ظ… ط§ظ† ط§ظ„ط³طھط§ظƒ ظپط§ط¶ظٹظ‡
     return -111;// this function return a dummy value case of empty stack
}//else if
}//top

//ظ†ط®ظ„ظٹ ط§ظ„ط³طھط§ظƒ ظپط§ط¶ظٹظ‡ ظˆظ†ط­ط°ظپ ظƒظ„ ط§ظ„ظ„ظٹ ظپظٹظ‡ط§
void MakeNull(){
    top = elements.length;// make the stack empty
}//method MakeNull
}//public class        




