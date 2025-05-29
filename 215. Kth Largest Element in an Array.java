class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num : nums) {
            minHeap.offer(num);
            if(minHeap.size() > k) {
                minHeap.poll(); //Remove the smallest element to maintain the heap size as k
            } 
        }

        return minHeap.poll(); //The root of the minHeap is the kth largest element
    }
}
