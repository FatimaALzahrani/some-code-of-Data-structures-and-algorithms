/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * fatima mohammed | F42
 */
public class DoublyLinkedList {
    Node head;
 // Insert at the front of the doubly-linked list
public void push(int newdata) { 
// 1. allocate nodeآ  2. put in the data 
Node NewNode = new Node(newdata); 
/* 3. Make next of new node as head and previous as NULL */
NewNode.next = head; 
NewNode.prev = null; 
// 4. change prev of head node to new node 
if (head != null) 
head.prev = NewNode;
// 5. move the head to point to the new node 
head = NewNode;
}// method push

//Insert a node at the end of doubly-linked list
void append(int new_data) {
/* 1. allocate nodeآ  * 2. put in the data */
Node new_node = new Node(new_data); 
/* 3. This new node is going to be the last node, so 
 * make next of it as NULL*/
new_node.next = null;
// 4. If the Linked List is empty, then make the new node as head 
if (head == null) {
new_node.prev = null;
head = new_node; 
return; 
} 
Node last = head; 
/* 5. Else traverse till the last node */
while (last.next != null) 
last = last.next; 
/* 6. Change the next of last node */
last.next = new_node; 
/* 7. Make last node as previous of new node */
new_node.prev = last;
}//append method

//Insert a node after a given node
public void InsertAfter(Node prev_Node, int new_data) {  
//1. check if the given prev_node is NULL 
if (prev_Node == null) { 
System.out.println("The given previous node cannot be NULL "); 
return; 
} 
// 2. allocate nodeآ   3. put in the data 
Node new_node = new Node(new_data); 
// 4. Make next of new node as next of prev_node 
new_node.next = prev_Node.next; 
// 5. Make the next of prev_node as new_node 
prev_Node.next = new_node; 
// 6. Make prev_node as previous of new_node 
new_node.prev = prev_Node; 
// 7. Change previous of new_node's next node 
//ظ†طھط§ظƒط¯ ط§ظˆظ„ ط§ظ†ظ‡ ظ…ظˆ ظ‡ظˆ ط§ظ„ط§ط®ظٹط± ظ„ط§ظ† ظ„ظˆ ظƒط§ظ† ط§ظ„ط§ط®ظٹط± ط§طµظ„ط§ ظ…ط§ ط¨ظ†ط­طھط§ط¬ ط§ظ„ط¨ط±ظٹظپظٹط³ ظ„ط§ظ† ظ…ط§ ط¹ظ†ط¯ظ‡
if (new_node.next != null) 
new_node.next.prev = new_node; 
}//after method 

//Insert a node before a given node
public void insertBefore(Node next_node, int newdata){ 
 //ظ†ط؛ظٹط± ظ…ط¤ط´ط¤ط§طھ ط¨ط±ظٹظپظٹط³ ط¨ط¹ط¯ظٹظ† ظ…ط¤ط´ط±ط§طھ ط§ظ„ظ†ظƒط³طھ
//1. check if the given new_node is NULL 
if (next_node == null) {
System.out.println("the given next node cannot be NULL");
return;
}//if
//  allocate new node 
Node NewNode = new Node(newdata); 
//  Make prev of new node as prev of NewNode 
NewNode.prev = next_node.prev;
//  Make the prev of next_node as NewNode 
next_node.prev = NewNode;
//  Make next_node as next of NewNode 
NewNode.next = next_node;
//  Change next of new_node's previous node 
if (NewNode.prev != null)
NewNode.prev.next = next_node;
//  If the prev of new_node is NULL, it will be the new head node
else
head= NewNode; }
   //آ the hole method delete Node from doubly linked List
void deleteNode(Node del) { 
if (head == null || del == null) { 
  System.out.println("list is empty");
return; 
} 
if (head == del) { 
head = head.next; 
} 
// Change next only if node to be deleted 
// is NOT the last node 
if (del.next != null) {
del.next.prev= del.prev; 
} 
// Change prev only if node to be deleted 
// is NOT the first node 
if (del.prev != null) { 
del.prev.next = del.next; 
}
}

public void printlist() { 
Node last = head; 
while (last != null) { 
System.out.print(last .data + " "); 
last = last .next; 
} 
System.out.println(); 
}

//insertInOrder that adds an integer in its proper place in a sorted list of integers
public void insertInOrder(int newdata) {
Node newnode=new Node(newdata);
    if (head != null && head.data >= newdata){ 
    newnode.next = head; 
    newnode.prev = null; 
   //  change prev of head node to new node 
   head.prev = newnode;
   //  move the head to point to the new node 
   head = newnode; 
   return;
}//if
Node temp=head;
while(temp!= null){
if(temp.data>=newdata){
    insertBefore(temp,newdata);
    /*temp.prev.next=newnode;
    newnode.next=temp;
    temp.prev=newnode;*/
    return;
}else if(temp.data<=newdata && temp.next==null){
    append(newdata);
}else
    temp=temp.next;
}
} //insertInOrder
}//class
