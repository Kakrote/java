public class LLcycle {
    private ListNode head;
    private int size;
    private ListNode tail;

    public void insertFirst(int value) {
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public boolean isCycle(LLcycle list) {
        ListNode slow = list.head;
        ListNode fast = list.head;
        while (fast.next != null && fast != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;

        }
        System.out.println("end");
    }

    public int length_of_cycle(LLcycle list) {
        int len = 0;
        if (isCycle(list)) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast.next != null && fast != null) {

                fast = fast.next.next;
                slow = slow.next;
                if (slow == fast) {
                    ListNode temp = slow;
                    // System.out.println(temp.value);
                    do {
                        len += 1;
                        temp = temp.next;
                    } while (temp != slow);
                    break;
                }

            }

        }

        return len;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                ListNode ptr1 = head;
                ListNode ptr2 = slow;
                while (ptr1 != ptr2) {

                    ptr2 = ptr2.next;
                    ptr1 = ptr1.next;
                    if (ptr1 == ptr2) {
                        return ptr1;
                    }
                    break;
                }
            }

        }
        return null;

    }

    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode tmp = head;
        while (tmp != null && tmp.next != null) {
            if (tmp.next.val == val) {
                // tmp.next = tmp.next.next;
                ListNode tmp1 = tmp.next;
                while (tmp1 != null && tmp1.val == val)
                    tmp1 = tmp1.next;
                tmp.next = tmp1;
            }
            tmp = tmp.next;
        }

        return head;

    }

    class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int value) {
            this.val = value;

        }

        public ListNode(int value, ListNode next) {
            this.next = next;
            this.val = value;
        }
    }

    public static void main(String[] args) {
        LLcycle l1 = new LLcycle();
        l1.insertFirst(1);
        l1.insertFirst(2);
        l1.insertFirst(3);
        l1.insertFirst(4);
        l1.insertFirst(5);
        l1.insertFirst(6);
        l1.insertFirst(5);
        // l1.display();
        // l1.tail.next=l1.head.next.next;
        // System.out.println(l1.isCycle(l1));
        // System.out.println(l1.length_of_cycle(l1));
        // Node ans=l1.detectCycle(l1.head);
        // System.out.println(ans.value);\
        l1.display();

        ListNode ans = l1.removeElements(l1.head, 5);
        // System.out.println(ans.value);
        // ans.display();
        while(ans!=null){
            System.out.print(ans.val+"->");
            ans = ans.next;
        }
    }

}
