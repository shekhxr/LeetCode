class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack <Integer> stack = new Stack<>();
        int n = heights.length;

        for(int i=0;i<=heights.length;i++) {
            int currHeight = (i == n) ? 0 : heights[i];
            while(!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int length = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, length * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
