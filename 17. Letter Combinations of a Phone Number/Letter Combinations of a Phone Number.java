class Solution {
    private String keypad[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if(digits == null || digits.length() == 0) {
            return combinations;
        }

        backtrack(combinations, digits, "", 0);
        return combinations;
    }

    private void backtrack(List<String> combinations, String digits, String currentCombination, int index) {
        if(index == digits.length()) {
            combinations.add(currentCombination);
            return;
        }
        String letters = keypad[digits.charAt(index) - '0'];
        for(char letter : letters.toCharArray()) {
            backtrack(combinations, digits, currentCombination + letter, index + 1);
        }
    }
}
