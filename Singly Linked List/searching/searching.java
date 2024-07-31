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
class searching{
    public static Node convertArrayToLinkedlist(int[] arr){
        //head is create
        Node head=new Node(arr[0]);
        //head is assign has mover
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            //temp is created
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static void traverselLinkedList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +" ");
           temp= temp.next;
        }
    }
    public static int lengthOfLinkedList(Node head){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
           temp=temp.next;
        }
        return count;
    }
    public static int searchNode(Node head,int i){
        Node temp=head;
        while(temp!=null){
            if(temp.data==i){
                return 1;
            }
            temp=temp.next;
        }
        return 0;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        Node head=convertArrayToLinkedlist(arr);// get head
        traverselLinkedList(head);
        System.out.println("");
        System.out.println("length : " +lengthOfLinkedList(head));
        int i=3;
        System.out.println(searchNode(head,3));
    }
}