/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        // Move fast ahead by n+1 steps (so slow ends up before target node)
        for(int i=0;i<n+1;i++) {
            if(fast == null) return head;
            fast = fast.next;
        }

        // Move both pointers
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the nth node from end
        slow.next = slow.next.next;
        return dummy.next;
    }
}
