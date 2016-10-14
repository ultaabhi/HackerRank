/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    if(head==null||head.next==null){
        return head;
    }
    Node cur = head;
    while(head.next!=null){
        if(head.data!=head.next.data){
            head=head.next;
        }else{
            head.next=head.next.next;
        }
        
    }
    return cur;

}