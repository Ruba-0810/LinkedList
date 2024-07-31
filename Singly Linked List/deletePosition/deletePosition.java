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
class deletePosition{
public static Node ArrayConvertIntoLinkedList(int[] arr){
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
public static Node deletePosition(Node head,int k){
    
    if(head==null){
        return null;
    }
    if(k==1){
        head=head.next;
        return head;
    }
    int count=0;
    Node temp=head;
    Node previous=null;
    while(temp!=null){
        count++;
        if(count==k){
           previous.next=previous.next.next;
           break;
        }
        previous=temp;
        temp=temp.next;
    }
    return head;
}
public static void main(String[] args){
    int[] arr={1,2,3,4,5};
    Node head= ArrayConvertIntoLinkedList(arr);
    head=deletePosition(head,3);
    traversel(head);
   }
}