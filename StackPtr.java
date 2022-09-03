/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_Using_List;

/**
 *
 * 
 */
public class StackPtr {
  private Node top;
public void push(int x){
Node N = new Node(x);// create a new node with data x
N.next = top;// new node refer to the stack top
top = N;// the new node will be the stack top
}//push methode

public void pop(){
  if (!isEmpty())
      top = top.next;// to pop just advance the top  
  else
   System.out.println("Stack is empty (Underflow)");
}//pop methode
/*
Node N = new Node(d);
  if(N.data==d)
  N.data=null;
*/

public boolean isEmpty(){
    if(top==null)
return true;
    else
        return false;
}//isEmpty methode

public int Top (){
if (!isEmpty())
    return top.data; 
 else return -1;// this function return a dummy value case of empty stack}
 }//Top methode

void makeNull(){
    top = null;// to delete all elements just make the top point to null
}//makeNull methode 

}//class

