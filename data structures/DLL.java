public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public void insertfirst(int value){
        Node node=new Node(value);
        try{
            node.next=head;
            node.prev=null;
            if(head!=null){ // if the list is empty then head have no prev pointer 
                // it would give a null pointer exception

                head.prev=node; // this if there is already an element in the list
            }
            head=node; 
            if(tail==null){
                tail=head;
            }
            size+=1;
        }
        catch(Exception e){
            // System.out.println();
        }
    }

    public void insertEnd(int value){ // to add the iteam in the last of the list 
        if(tail==null){
            insertfirst(value); // if the list is empty 
        }
        Node node=new Node(value);
        Node temp=head;
        for (int i = 1; i <=size-1; i++) {
            temp=temp.next; // this 
        }
        temp.next=node;
        node.prev=temp;
        node.next=null;
        tail=node;
        size++;
    }

    public void insertAt(int value, int index){
        if(index==0){
            insertfirst(value);

        }
        else if(index==size){
            insertEnd(value);
        }

        else{

            
            Node temp=head;
            for (int i = 1; i < index; i++) {
                temp=temp.next;
            }
            Node node=new Node(value,temp,temp.next);
            temp.next.prev=node;
            temp.next=node;
            size++;
        }
    }

    public void deleteFirst(){
        if(head==null){
            tail=null;
        }
        else head=head.next;
        size--;
    }

    public void deleteEnd(){
        if(size<=1){
            deleteFirst();
        }
        else{
            Node temp=tail;
            temp=temp.prev;
            tail=temp;
            size--;
        }
    }

    public void deleteAt(int index){
        if(index==size){
            System.out.printf("%d this index is not present:- ",index);
            return;
        }
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteEnd();
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.next.prev=temp.next.next.prev.prev;
        size--;
    }

    public Node findNode(int value){
        Node node=head;
        do{
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        while(node!=tail.next);
        return null;
        
    }

    public void display(){
        Node temp=head;
        do{

            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        while (temp!=tail.next);
        System.out.println("End");
    }

    public void displayRev(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.value+"<-");
            temp=temp.prev;
        }
        System.out.println("Start");
    }
    
    class Node{
        private Node prev;
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node prev,Node next){
            this.prev=prev;
            this.value=value;
            this.next=next;
        }
    }

    public static void main(String[] args) {
        DLL dl=new DLL();
        dl.insertfirst(10);
        dl.insertfirst(20);
        dl.insertfirst(30);
        dl.insertEnd(5);
        dl.insertAt(15, 2);
        dl.insertAt(40, 0);
        dl.insertAt(1, 6);
        // System.out.println(dl.tail.value);
        dl.display();
        dl.deleteEnd();
        dl.deleteFirst();
        // dl.deleteAt(2);
        dl.deleteAt(1);
        // System.out.println(dl.tail.value);
        dl.display();
        System.out.println(dl.findNode(15)); 
        // dl.displayRev();
    }
}
