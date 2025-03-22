package Linked_List;

public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;

    //add
    public  void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if (head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public  void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if (head==null){
            head=tail=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        tail=newNode;
    }

    //remove first;

    public int removeFirst(){
        if (head==null){
            System.out.println("DDL is empty");
            return Integer.MIN_VALUE;
        }
        if (size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    public int removeLast(){
        if(head==null){
            return Integer.MIN_VALUE;
        }
        if(size==1){
            head=tail=null;
        }
        Node temp=head;
        while (temp.next!=null){

            temp=temp.next;
        }
        int val=temp.data;
        size--;
        tail=temp.prev;
        temp.prev=null;
        tail.next=null;

        return val;

    }

    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
  head=prev;
    }


    public static void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static int size;
    public static void main(String[] args) {
     DoubleLL dll=new DoubleLL();
    dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(5);
        dll.addLast(3);
//        dll.removeFirst();
//        dll.removeLast();
        dll.print();
        dll.reverse();
        dll.print();


        System.out.println(size);
    }
}
