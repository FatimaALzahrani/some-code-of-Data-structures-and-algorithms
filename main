/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12fat
 */
public class Main {
  public static void main(String[] args){ 
DoublyLinkedList dll = new DoublyLinkedList(); 
//ط¨ط³طھط¯ط¹ظٹ ظ…ظٹط«ظˆط¯ ط§ظ„ط§ط¨ظ†ط¯
dll.append(3);
// Insert 2 at the beginning. So linked list becomes 2->3->NULL 
dll.push(2);
// Insert 1 at the beginning. So linked list becomes 1->2->3->NULL 
dll.push(1);
//Insert 2, after 1. So linked list becomes 1->2->3->4->NULL 
dll.append(4);
//ط·ط¨ط§ط¹ط© ط§ظ„ظ‚ط§ط¦ظ…ط©
System.out.println("Created DLL is: ");
dll.printlist(); 
// Deleting first node 
dll.deleteNode(dll.head); 
System.out.println("List after deleting first node: "); 
dll.printlist(); 
// Deleting middle node 
dll.deleteNode(dll.head.next);
System.out.println("List after Deleting middle node: "); 
dll.printlist(); 
// Deleting last node from
dll.deleteNode(dll.head.next);
System.out.println("List after Deleting last node: ");
dll.printlist();
//add data has order
System.out.println("List after adds an integer 4 and 6 and 1 in its proper place in a sorted list of integers: ");
dll.insertInOrder(4);
dll.insertInOrder(6);
dll.insertInOrder(1);
dll.printlist();
} 
}
