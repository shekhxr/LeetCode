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
    public ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null ||head.next == null) {
            return true;
        }

        ListNode mid = findMid(head);
        ListNode rightHead = mid.next;
        rightHead = reverseLL(rightHead);

        ListNode leftHead = head;
        while(rightHead != null) {
            if(leftHead.val != rightHead.val) {
                return false;
            }
            leftHead = leftHead.next;
            rightHead = rightHead.next;
        }

        return true;
    }
}
