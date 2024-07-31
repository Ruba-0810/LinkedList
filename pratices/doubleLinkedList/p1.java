class Node{
    int data;
    Node next;
    Node back;
    Node(int data1,Node next1,Node back1){
        this.data=data1;
        this.next=next1;
        this.back=back1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
        this.back=null;
    }
}
class doubleLinkedList{
    //convert array to linkedList
    public static Node convertArrayToLinkedList(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],null,mover);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    //traversal the linkedList
    public static void traversal(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp=temp.next;
        }
        System.out.println("");
    }
    //delete the head 
    public static Node deletehead(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp=head;
        head=head.next;
        head.back=null;
        temp.next=null;
        return head;
    }
    //delete the tail
    public static Node deletetail(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next!=null){
             temp=temp.next;
        }
        //create one node
        Node last=temp.back;
        last.next=null;
        temp.back=null;
        return head;
    }
    //delete kth element
    public static Node deleteKthElement(Node head,int k){
       if(head==null){
          return null;
       }
       int count=0;
       Node temp=head;
       while(temp!=null){
         count++;
         if(count==k){
            break;
         }
         temp=temp.next;
       }
       Node previous=temp.back;
       Node front=temp.next;
       if(previous==null && front==null){
           return null;
       }
       else if(previous==null){
            return deletehead(head);
       }
       else if(front==null){
        return deletetail(head);
       }
      previous.next=front;
      front.back=previous;
      temp.next=null;
      temp.back=null;
      return head;
    }
    //delete the node
    public static void deleteNode(Node temp){
        Node previous=temp.back;
        Node front=temp.next;
        if(front==null){
            previous.next=null;
            temp.back=null;
        }
        previous.next=front;
        front.back=previous;
        temp.back=null;
        temp.next=null;
         
    }
    public static void main(String[]args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        Node head=convertArrayToLinkedList(arr);
        Node kthelement=deleteKthElement(head,5);
        traversal(kthelement);

    }

}