class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length) {
            return nums;
        }

        HashMap <Integer, Integer> count = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }

        Queue <Integer> heap = new PriorityQueue<>
        ((a,b) -> count.get(a) - count.get(b));

        for(int n : count.keySet()) {
            heap.add(n);
            if(heap.size() > k) {
                heap.poll();
            }
        }

        int res[] = new int[k];
        for(int i=0;i<k;i++) {
            res[i] = heap.poll();
        }
        
        return res;
    }
}
