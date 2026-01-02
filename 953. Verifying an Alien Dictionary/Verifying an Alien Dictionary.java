class Solution {
    private boolean isOrdered(String word1, String word2, HashMap<Character, Integer> map) {
        int minLength = Math.min(word1.length(), word2.length());

        for(int i=0;i<minLength;i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);

            if(c1 != c2) {
                return map.get(c1) < map.get(c2);
            }
        }

        return word1.length() <= word2.length();
    }

    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<order.length();i++) {
            map.put(order.charAt(i), i);
        }

        for(int i=0;i<words.length-1;i++) {
            if(!isOrdered(words[i], words[i+1], map)) return false;
        }

        return true;
    }
}
