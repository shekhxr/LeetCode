class MedianFinder {
    
    private PriorityQueue<Integer> lo = new PriorityQueue<>(Collections.reverseOrder()); //Max Heap
    private PriorityQueue<Integer> hi = new PriorityQueue<>(); //Min Heap
    
    public void addNum(int num) {
        lo.offer(num); //Add to max heap
        hi.offer(lo.poll()); //Balancing Step

        if(lo.size() < hi.size()) { //Maintain size property
            lo.offer(hi.poll());
        }
    }
    
    //Returns the median of current data stream
    public double findMedian() {
        return lo.size() > hi.size() ? lo.peek() : (lo.peek() + hi.peek()) * 0.5;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
