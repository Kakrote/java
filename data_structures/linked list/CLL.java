public class CLL {

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
             // in case if there is only one element
        }
        tail.next=head;
        size+=1;
    }

    public void insertEnd(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        tail.next=head;
        size++;
    }

    public void insertAt(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size-1){
            insertEnd(value);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
            
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
    }

    public void display(){
        Node temp=head;
        System.out.print("Start->");
        do{
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        while(temp!=head); //tail.next=head
        System.out.println("Start");
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
        CLL cl=new CLL();
        cl.insertFirst(10);
        cl.insertFirst(11);
        cl.insertEnd(9);
        cl.insertAt(7, 1);
        cl.display();
        // System.out.println(cl.head.value);
        // System.out.println(cl.tail.value);
        // System.out.println(cl.tail.next.value);
    }
}
