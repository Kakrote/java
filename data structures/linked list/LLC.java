// import org.w3c.dom.Node;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}

public class LLC {

    static ListNode head = null;

    static void insert(int x){
        if(head == null){
            head = new ListNode(x);
            return;
        }
        ListNode newNode = new ListNode(x);
        ListNode lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public static void display(){
        ListNode temp=head;
        System.out.print(temp.val+" -> ");
        while(temp.next !=null){
            temp=temp.next;
            System.out.print(temp.val+" -> ");
        }
        System.out.print("End");
    }
    public static void main(String[] args) {
        //ListNode head;// = new ListNode(0);
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        

        display();
    }

    public boolean isCycle(){
        ListNode slow=head;
        ListNode fast=head; 
        while (fast.next!=null && fast!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public  int length_of_cycle(LLC list){
        int len=0;
        if(isCycle()){
            ListNode slow=head;
            ListNode fast=head;
            while (fast.next!=null && fast!=null) {
                
                fast=fast.next.next;
                slow=slow.next;
                if(slow==fast){
                    ListNode temp=slow;
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
    // public ListNode detectCycle(ListNode head) {
        
    // }
}
