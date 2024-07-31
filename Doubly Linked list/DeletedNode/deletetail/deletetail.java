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
class DeleteTail{
    public static Node ArrayConvertToLinked(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],null,mover);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static void travesel(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    public static Node deletetail(Node head){
        if (head == null || head.next == null) {
            return null; 
        }
       Node temp=head;
       while(temp.next!=null){
           temp=temp.next;
       }
       //taking second value by using back
       Node secondlast=temp.back;
       secondlast.next=null;
       //make last previous has null
       temp.back=null;
       return head;
    }
    public static void main(String[] args){
        int[] arr={1,3,24,6,7,8,9,10};
        Node head= ArrayConvertToLinked(arr);
        Node tailNode=deletetail(head);
        travesel(tailNode);

    }
}