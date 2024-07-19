/**
 * LL
 */
public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }

    public void insertfirst(int value){ // this funtion adds the value in the first not in the end

        Node node=new Node(value); // creating a new node
        node.next=head; // it points to the head
        head=node; // head points to the node 

        if(tail==null){

            tail=head; // if it is the only node then tail will also point to the head

        }
        size+=1; // increase the size by one 
    }

    public void insertEnd(int value){
        // this will add the value in the end of the linkedList
        if(tail==null){
            // this checks if the list is empty
            insertfirst(value);
            return;
        }
        Node node=new Node(value);// create a new node
        tail.next=node;// tail.next will point to the new node now 
        tail=node;// tail will become new node

        size+=1;
    }
    public void insertAt(int value,int index){

        if(index==0){
            insertfirst(value);
            return;
        }
        if(index==size){
            insertEnd(value);
            return;
        }
        Node temp=head; // it is already at index 0 hence it should start index from 1
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size+=1;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.print("End");
    }

    // deleting 
    public void deletFirst(){
        head=head.next;
        if(head==null){
            tail=null;
        }
        System.out.println();
        size--;
    }

    private class Node{
        private int value;
        private Node next;
        
        public Node(int value){
            this.value=value;

        }
        public Node(int value , Node next){
            this.value=value;
            this.next=next;
        }
    }
    public static void main(String[] args) {

        LL l=new LL();
        l.insertfirst(10);
        l.insertfirst(11);
        l.insertfirst(12);
        l.insertfirst(13);
        l.insertEnd(20);
        l.insertAt(100, 3); 
        l.display(); // 13->12->11->10->end  
        l.deletFirst();
        l.display();

    }
}