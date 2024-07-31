class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
    }
}
class deleteTail{
    public static Node ArrayToLinkedList(int [] arr){
    Node head=new Node(arr[0]);
    Node mover=head;
    for(int i=1;i<arr.length;i++){
        Node temp=new Node(arr[i]);
        mover.next=temp;
        mover=temp;
    }
    return head;
   }
   public static void traverse(Node head){
     Node temp=head;
     while(temp!=null){
          System.out.println(temp.data);
          temp=temp.next;
     }
   }
   public static Node deleteTail(Node head){
    Node temp=head;
   if(head==null || head.next==null){
    return null;
   }
   while(temp.next.next!=null){
    temp=temp.next;
     }
     temp.next=null;
     return head;
   }
   public static void main(String[] args){
    int[] arr={1,2,3,4,5};
    Node head=ArrayToLinkedList(arr);
    head=deleteTail(head);
    traverse(head);
   }
}
