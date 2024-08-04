public class LinkedListusingrecursion {
    private Node head;

    public void insertFirst(int value){
        Node newnode=new Node(value);
        newnode.next=head;
        head=newnode;

    }
    //using a void return type

    public void insertRec(int value,int index,Node node){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==1){
            Node newnode=new Node(value, node.next);
            node.next=newnode;
            return;
        }
        insertRec(value, index-1, node.next);
    }

    // with a node return type
    public void insertrec(int value,int index){
        head=insertrec(value, index, head);
    }
    public Node insertrec(int value,int index,Node node){
        if(index==0){
            Node temp=new Node(value, node);
            return temp;
            
        }
        node.next=insertrec(value, --index, node.next);
        return node;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("end");
    }

    class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }


    public static void main(String[] args) {
        LinkedListusingrecursion lr=new LinkedListusingrecursion();
        lr.insertFirst(10);
        lr.insertFirst(11);
        lr.insertFirst(12);
        lr.insertFirst(13);
        lr.display();
        // lr.insertRec(20, 2, lr.head);
        lr.insertrec(24, 2);
        lr.display();
    }
}
