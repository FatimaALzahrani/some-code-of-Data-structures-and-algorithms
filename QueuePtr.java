/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class QueuePtr {
Node front, rear;     
QueuePtr (){
   rear = front = null;  }   // The constructor

void ENQUEUE (int x) {
Node N = new Node(x);// create a node for the new element
if(rear != null){//ط§ط°ط§ ظ…ط§ ظƒط§ظ†طھ ظپط§ط¶ظٹظ‡
    rear.next = N;// connect the new node to the queue case of non empty queue
      rear = N; // make the new node the rear of the queue
}else {
    front = rear = N; }   // for an empty queue make the new node as the front and the rear for the one element queue
/*ط§ظˆ ظ†ظ‚ط¯ط± ظ†ظ‚ظˆظ„ ط§ظ„ط¹ظƒط³
Node N = new Node(x);
if(rear == null){
    front = rear = N;
}else {
    rear.next = N;// connect the new node to the queue case of non empty queue
      rear = N; // make the new node the rear of the queue
}*/
}//method ENQUEUE

//return true when the queue is empty which is the case when the front point to nullBoolean isEmpty () 
Boolean isEmpty () { 
    if (front == null) 
    return true;
else return false; }// add an element to the rear of the queue

// to delete an element from the queue
void DEQUEUE (){
if (isEmpty ())//ط§ط°ط§ ظƒط§ظ†طھ ظپط§ط¶ظٹظ‡
   System.out.println(" error queue is empty");// empty queue
   else if (front == rear) front = rear = null;  // one Node in the queue
         else  front = front.next;// otherwise there are more than one node
}//method DEQUEUE

// return the front of the queue
int  FRONT (){
if (!isEmpty ())
    return front.data;    
else {
    System.out.println(" error queue is empty"); 
        return -1111; //-1111 is a dummy value since a function must return a value
 }//else
}//method front

}//class

