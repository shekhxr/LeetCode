class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        List<Character> vowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');

        int i = 0;
        int j = sb.length() - 1;

        while(i < j) {
            while(i < j && !vowels.contains(sb.charAt(i))) {
                i++;
            }

            while(i < j && !vowels.contains(sb.charAt(j))) {
               j--;
            }

            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);

            i++; j--;
        }

        return sb.toString();
    }
}
