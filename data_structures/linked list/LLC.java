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
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (fast.next!=null && fast!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                ListNode ptr1=head;
                ListNode ptr2=slow;
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

    public ListNode removeElements(ListNode head, int val) {
     
        ListNode ptr1=head;
        ListNode ptr2=head;
        // ListNode node;
        while (ptr2!=null) {
            ptr1.next=ptr2;
            if(ptr2.val==val){
                ptr1.next=ptr2.next;
            }
            ptr2=ptr2.next;
            
        }
        return ptr1;
        
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;      // Initialize prev to null
        ListNode current = head;   // Start current at the head of the list
        
        while (current != null) {  // Traverse the list until the end
            ListNode next = current.next; // Temporarily store the next node
            current.next = prev;          // Reverse the current node's pointer
            prev = current;               // Move prev and current one step forward
            current = next;
        }
        
        return prev; // prev will be the new head of the reversed list
    }
    
}
