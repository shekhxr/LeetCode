class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack <Integer> stack = new Stack<>();
        Set <Integer> set = new HashSet<>();

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(') { //Valid Parenthesis
                stack.add(i);
            } else if(s.charAt(i) == ')') {
                if(stack.isEmpty()) { //Invalid parenthesis
                    set.add(i);
                } else { //Valid Parenthesis
                    stack.pop();
                }
            } 
        }

        while(!stack.isEmpty()) { //Invalid parenthesis
            set.add(stack.pop());
        }

        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if(!set.contains(i)) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
