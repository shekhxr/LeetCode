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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue <Integer> heap = new PriorityQueue<>();
        for(ListNode list : lists) {
            while(list != null) {
                heap.add(list.val);
                list = list.next;
            }
        }

        ListNode mergedLL = new ListNode(-1);
        ListNode temp = mergedLL;

        while(!heap.isEmpty()) {
            temp.next = new ListNode(heap.remove());
            temp = temp.next;
        }
        return mergedLL.next;
    }

}
