class Solution {
    public boolean isValid(String s) {
        // Stack to store left symbols
        Stack<Character> leftSymbols = new Stack<>();
        // Loop for each character of the string
        for (char ch : s.toCharArray()) {
            // If left symbol is encountered
            if (ch == '(' || ch == '{' || ch == '[') {
                leftSymbols.push(ch);
            }
            // If right symbol is encountered
            else if (ch == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
                leftSymbols.pop();
            } else if (ch == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
                leftSymbols.pop();
            } else if (ch == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
                leftSymbols.pop();
            }
            // If none of the valid symbols is encountered
            else {
                return false;
            }
        }
        return leftSymbols.isEmpty();
    }
}

