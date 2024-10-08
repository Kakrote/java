class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}

public class IntersectionTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Edge case: if either head is null, no intersection
        if (headA == null || headB == null) {
            return null;
        }
    
        // Initialize two pointers to the heads of the lists
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
    
        // Traverse both lists until the two pointers meet
        while (ptr1 != ptr2) {
            // If ptr1 reaches the end of list A, switch it to the head of list B
            if (ptr1 == null) {
                ptr1 = headB;
            } else {
                ptr1 = ptr1.next;
            }
    
            // If ptr2 reaches the end of list B, switch it to the head of list A
            if (ptr2 == null) {
                ptr2 = headA;
            } else {
                ptr2 = ptr2.next;
            }
        }
    
        // Either both pointers meet at the intersection node or both are null (no intersection)
        return ptr1;
    }
    
}
