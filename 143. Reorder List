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
    public void reorderList(ListNode head) {
        //Step 1 - Find Mid Node
        ListNode mid = findMid(head);

        //Step 2 - Reverse right half
        ListNode curr = mid.next;
        mid.next = null;
        ListNode prev = null;
        ListNode next;

        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode leftHalf = head;
        ListNode rightHalf = prev;
        ListNode nextLeft, nextRight;

        //Step 3 - ZigZag Merge
        while(leftHalf!=null && rightHalf!=null) {
            nextLeft = leftHalf.next;
            leftHalf.next = rightHalf;
            nextRight = rightHalf.next;
            rightHalf.next = nextLeft;
            //Updating values
            leftHalf = nextLeft;
            rightHalf= nextRight; 
        }
    }

    public ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
