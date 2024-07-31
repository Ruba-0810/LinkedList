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
class Main{
    //array is convert into linkedList
    public static Node arrayConvertLinkedList(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    // travel the linkedList
    public static void travesel(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"-->");
            temp=temp.next;
        }
        System.out.println();
    }
    //find the length;
    public static int lengthOfLinkedList(Node head){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    //search data in linkedList
    public static int search(Node head,int k){
        Node temp=head;
        while(temp!=null){
            if(temp.data==k){
                return 1;
            }
            temp=temp.next;
        }
        return 0;
    }
    //delete the head of single linkedList
    public static Node deleteheadSingleLinkedList(Node head){
        if(head==null || head.next==null){
            return null;
        }
        head=head.next;
        return head;
    }
    //delete the tail of single linkedList
    public static Node deletetailSingleLinkedList(Node head){
        if(head==null ||head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
              temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    //delete the kth position
    public static Node deleteKthPositionSingleLinkedList(Node head,int k){
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
            if(k==count){
                previous.next=previous.next.next;
                break;
            }
            previous=temp;
            temp=temp.next;
        }
         return head;
    }
    //delete the value of k
    public static Node deletevalueSingleLinkedList(Node head,int i ){
        if(head==null){
            return null;
        }
        if(head.data==i){
            return head;
        }
        Node temp=head;
        Node previous=null;
        while(temp!=null){
            if(temp.data==i){
                previous.next=previous.next.next;
                break;
            }
            previous=temp;
            temp=temp.next;
        }
         return head;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,45,8,60,75,40,35,87,568,100,295,7789};
        Node head= arrayConvertLinkedList(arr);
        System.out.println("Travesel the linkedList");
        travesel(head);
        System.out.println("Searching the element");
        System.out.println(search(head,45));
        System.out.println("Length Of LinkedList");
        int count=lengthOfLinkedList(head);
        System.out.println(count);
        System.out.println("Delete the head");
        Node deletehead=deleteheadSingleLinkedList(head);
        System.out.println(deletehead.data);
        System.out.println("After delete head Travesel the linkedList");
        travesel(deletehead);
        System.out.println("After delete tail Travesel the linkedList");
        Node deletetail=deletetailSingleLinkedList(head);
        travesel(deletetail);
        System.out.println("After delete Kth position Travesel the linkedList");
        Node deleteKth=deleteKthPositionSingleLinkedList(head,4);
        travesel(deleteKth);
        System.out.println("After delete value Travesel the linkedList");
        Node deleteValue=deletevalueSingleLinkedList(head,40);
        travesel(deleteValue);


        
    }
}