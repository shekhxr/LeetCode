class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        
        //Starting with the first string in the array as the initial prefix
        String prefix = strs[0];

        for(int i=1;i<strs.length;i++) {
            //Narrow down the prefix with each comparison
            while(strs[i].indexOf(prefix) != 0) {
                //Shorten the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);
                //If the prefix becomes empty then there's no common prefix
                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
