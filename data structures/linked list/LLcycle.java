public class LLcycle {
    private Node head;
    private int size;
    private Node tail;

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public boolean isCycle(LLcycle list){
        Node slow=list.head;
        Node fast=list.head; 
        while (fast.next!=null && fast!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;

        }
        System.out.println("end");
    }

    public  int length_of_cycle(LLcycle list){
        int len=0;
        if(isCycle(list)){
            Node slow=head;
            Node fast=head;
            while (fast.next!=null && fast!=null) {
                
                fast=fast.next.next;
                slow=slow.next;
                if(slow==fast){
                    Node temp=slow;
                    // System.out.println(temp.value);
                    do{
                        len+=1;
                        temp=temp.next;
                    }
                    while(temp!=slow);
                    break;
                }
                
                
            }


        }
        
        return len;
    }

    public Node detectCycle(Node head) {
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                Node ptr1=head;
                Node ptr2=slow;
                while (ptr1!=ptr2) {
                    
                    ptr2=ptr2.next;
                    ptr1=ptr1.next;
                    if(ptr1==ptr2){
                        return ptr1;
                    }
                    break;
                }
            }
            
        }
        return null;
        
    }

    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;

        }

        public Node(int value, Node next) {
            this.next = next;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LLcycle l1 = new LLcycle();
        l1.insertFirst(1);
        // l1.insertFirst(2);
        // l1.insertFirst(3);
        // l1.insertFirst(4);
        // l1.insertFirst(5);
        // l1.insertFirst(6);
        // l1.display();
        // l1.tail.next=l1.head.next.next;
        System.out.println(l1.isCycle(l1));
        System.out.println(l1.length_of_cycle(l1));
        Node ans=l1.detectCycle(l1.head);
        System.out.println(ans.value);
    }

}
