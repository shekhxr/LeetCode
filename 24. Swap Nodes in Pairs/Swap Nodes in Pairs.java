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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        while(head != null && head.next != null) {
            //Nodes to be swapped
            ListNode first = head;
            ListNode second = head.next;

            //Swapping the nodes
            prev.next = second;
            first.next = second.next;
            second.next = first;

            //Move pointers forward for next swap
            prev = first;
            head = head.next;
        }

        return dummy.next;
    }
}
