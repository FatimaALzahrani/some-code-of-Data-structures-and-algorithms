public class SingleLinkedList {
    Node head;
    public void append (int newdata){
    Node newnode=new Node(newdata);
    if(head==null){
    head=new Node(newdata); 
    return;
    }//if
    newnode.next=null;
    Node last=head;
    while(last.next !=null)
    last=last.next;
    last.next=newnode;
    return;
}
    public void push (int newdata){
    Node newnode = new Node(newdata); 
    newnode.next=head;
    head=newnode;
    }
    }
    public void insertafter (Node PrevNode,int newdata){
    if(PrevNode.next==null){
        System.out.println("The next of previous node cannot be null , becuse that mean is last node");
    }//if
    Node newnode = new Node(newdata); 
    newnode.next=PrevNode.next;
    PrevNode.next=newnode;
    }//insertafter method
    
    void printList(){
    Node n =head;
    while (n!=null){
    System.out.print(n.data+" "); 
    n=n.next;
    }// while 
    }//method printList
    
    void deleteNodeFirst(int key) { 
    // Store head node 
    // If head node itself holds the key to be deleted 
    if (head != null && head.data == key){ 
    head = head.next; // Changed head 
    return;  
}//if
    Node tmp = head; 
    // Search for the key to be deleted
    while(tmp.next != null){
    if (tmp.next.data == key) {
    tmp.next = tmp.next.next; 
    return;
    }else
    tmp = tmp.next;
}//while loop
    }//method deleteNode
        void deleteNodeLast(int key) { 
    Node tmp=head;
    Node last=null;
    while(tmp.next != null){
    if (tmp.next.data == key) {
    last = tmp;
    }
    tmp =tmp.next;
}//while loop
    last.next = last.next.next;
    /*
    if (tmp.next.data == key) {
    head = head.next; 
    }*/
    }//method deleteNode
    }//public class
