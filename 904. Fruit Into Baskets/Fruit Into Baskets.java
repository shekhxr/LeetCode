class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int maxFruits = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int right=0;right<fruits.length;right++) {
            // Step 1: Expand the window by adding the current fruit at 'right'
            freqMap.put(fruits[right], freqMap.getOrDefault(fruits[right],0) + 1);

            // Step 2: Shrink the window if it becomes invalid (more than 2 fruit types)
            while(freqMap.size() > 2) {
                freqMap.put(fruits[left],freqMap.get(fruits[left]) - 1);
                if(freqMap.get(fruits[left]) == 0) {
                    freqMap.remove(fruits[left]);
                }
                left++;
                
            } 
            
            // Step 3: Update maxFruits with the current valid window size
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
}
