  public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {

    ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;

        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode left = head;
        ListNode right = slow.next;
        right = reverse(right);

        while(right != null){
            if(left.val != right.val) return false;
            left = left.next;
            right = right.next;
        }

        return true;
    }
}
