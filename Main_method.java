public class Main {
    public static void main(String [] args){
        SingleLinkedList list = new SingleLinkedList(); 
        list.append(4);
        // Insert 2 at the beginning. So linked list becomes 3->4->NULL 
        list.push(3);
        // Insert 1 at the beginning. So linked list becomes 1->3->4->NULL 
        list.push(1);
        // Insert 4 at the beginning. So linked list becomes 4->1->3->4->NULL 
        list.push(4);
        //Insert 2, after 1. So linked list becomes 4->1->2->3->4->NULL 
        list.insertafter(list.head.next, 2);
        // Insert 2 at the end. So linked list becomes 4->1->2->3->4->2->NUll
        list.append(2);
        System.out.println(" Linked list is :"); 
        //print the list
        list.printList(); 
        list.deleteNodeFirst(4); // Delete node at position 4 
        System.out.println("\n Linked List after first Deletion of 4 is :"); 
        list.printList(); 
        //___________________________________________طھط¬ط±ظٹط¨ deleteNodeLastظ„
        list.deleteNodeLast(2); 
         System.out.println("\n Linked List after last Deletion of 2 is :"); 
        list.printList(); 
        
    }
}
