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
class DeleteHead{
    public static Node ArrayConvertToLinked(int[] arr){
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
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    public static Node deletehead(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node previous=head;
        head=head.next;
        previous.next=null;
        head.back=null;
        return head;
    }
    public static void main(String[] args){
        int[] arr={1,3,24,6,7,8,9,10};
        Node head= ArrayConvertToLinked(arr);
        Node headNode=deletehead(head);
        travesel(headNode);

    }
}