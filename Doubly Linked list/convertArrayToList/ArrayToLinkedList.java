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
class DD{
    public static Node convertArrayToLinkedList(int[] arr){
        Node head=new Node(arr[0]);
        Node previous=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],null,previous);
            previous.next=temp;
           previous=temp;
           
        }
        return head;
    }
    public static void travesel(Node head){
       Node temp=head;
       while(temp!=null){
        System.out.println(temp.data + " ");
        temp=temp.next;
       }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        Node head=convertArrayToLinkedList(arr);
        travesel(head.data);
    }
}
