class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
class deletevalue{
   public static Node ArrayconvertToLinkedList(int[] arr){
    Node head=new Node(arr[0]);
    Node mover=head;  
    for(int i=1;i<arr.length;i++){
        Node temp=new Node(arr[i]);
        mover.next=temp;
        mover=temp;
    }
    return head;
   }
   public static void traversel(Node head){
    Node temp=head;
   while(temp!=null){
      System.out.println(temp.data + " ");
      temp=temp.next;
     }
   }
   public static Node deleteTheNode(Node head,int value){
    if(head==null){
        return null;
    }
    if(head.data==value){
        head=head.next;
        return head;
    }
    Node temp=head;
    Node previous=null;
    while(temp!=null){
        if(temp.data==value){
            previous.next=previous.next.next;
            break;
        }
        previous=temp;
        temp=temp.next;
    }
    return head;
   }
   public static void main(String[] args){
    int[] arr={1,2,9,4,5};
    Node head= ArrayconvertToLinkedList(arr);
    head=deleteTheNode(head,9);
    traversel(head);
   }
}