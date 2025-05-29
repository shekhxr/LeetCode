class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> s = new Stack<>();

        for(String token : tokens) {
            if(isOperator(token)) {
                int b = s.pop(); //Second Operand
                int a = s.pop(); //First Operand
                s.push(applyOperator(token, a, b));
            } else {
                s.push(Integer.parseInt(token));
            }
        }
        return s.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int applyOperator(String operator, int a, int b) {
        switch (operator) {
            case "+" : return a + b;
            case "-" : return a - b;
            case "*" : return a * b;
            case "/" : return a / b;
            default : throw new IllegalArgumentException("Invalid Operator");
        }

    }
}
