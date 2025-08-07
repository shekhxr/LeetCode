class Solution {
    public String reverseWords(String s) {
        // Step 1: Store words here
        List<String> words = new ArrayList<>();

        int n = s.length();
        int i = 0;

        // Step 2: Loop through the string to extract words  
        while(i < n) {
            while(i < n && s.charAt(i) == ' ') {
                i++;
            }

            if(i < n) {
                StringBuilder word = new StringBuilder();

                while(i < n && s.charAt(i) != ' ') {
                    word.append(s.charAt(i));
                    i++;
                }

                words.add(word.toString());
            }
        }

        // Step 3: Reverse the list of words
        Collections.reverse(words);

        // Step 4: Join the words with one space between them
        return String.join(" ", words);
    }
}
