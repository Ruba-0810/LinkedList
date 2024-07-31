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
class deleteKthElement{
    public static Node convertArrayToList(int[] arr){
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
    public static Node deleteHead(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node previous=head;
        head=head.next;
        previous.next=null;
        head.back=null;
        return head;
        
    }
    public static Node deletetail(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node previous=head;
        while(previous.next!=null){
            previous=previous.next;
        }
        Node secondValue=previous.back;
        secondValue.next=null;
        previous.back=null;
        return head;

    }
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
       }else if(previous==null){
            return deleteHead(head); 
       }else if(front==null){
            return deletetail(head);
       }
       previous.next=front;
       front.back=previous;
       temp.back=null;
       temp.next=null;
       return head;
    }
    //DELETING NODE
    public static void deleteNode(Node temp){
        Node previous=temp.back;
        Node front=temp.next;
        if(front==null){
            previous.next=null;
            temp.back=null;
        }
        previous.next=front;
        front.back=previous;
        temp.next=null;
        temp.back=null;
    }
    public static void main(String[] args){
        int[] arr={1,3,24,6,7,8,9,10};
        Node head= convertArrayToList(arr);
       //Node headNode=deleteKthElement(head,3);
       deleteNode(head.next);
       travesel(head);

    }
}