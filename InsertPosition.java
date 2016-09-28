/*
Insert a node at a specific position in a linked list */

/*

  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node tmp = new Node();
    tmp.data=data;
    tmp.next=null;
    if(head==null){
        head=tmp;
        return head;
    }
    if(position==0){
        tmp.next=head;
        head=tmp;
        return head;
    }
    Node cur = head;
    for(int i=1;i<position;i++){
        cur=cur.next;
    }
    tmp.next=cur.next;
    cur.next=tmp;
    return head;
    
    
}
