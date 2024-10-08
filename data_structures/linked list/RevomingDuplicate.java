public class RevomingDuplicate {
    // the linked list given is sorted 
    private Node head;

    public void insert(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
    }
    public void RemoveDup() throws NullPointerException{
        Node p1=head;
        Node p2=p1.next;
        while(p1!=null){
            // System.out.print(p1.value+"->");
            while (p2!=null) {
                
                if(p1.value==p2.value){
                    p2=p2.next;
                }   
                else{
                    break;
                }
            }
            p1.next=p2;
            p1=p2;
            if(p2!=null){
                
                p2=p2.next;
            }

        }
        // System.out.println("end");
        
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("End");
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
        RevomingDuplicate rd=new RevomingDuplicate();
        // rd.insert(4);
        rd.insert(4);
        rd.insert(4);
        rd.insert(3);
        rd.insert(3);
        rd.insert(2);
        rd.insert(1);
        rd.insert(1);
        rd.insert(1);
        rd.display();
        rd.RemoveDup();
        rd.display();

    }
}
