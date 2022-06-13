class Solution {
    public String makeGood(String s) {
     
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            
            char c = s.charAt(i);
            
            if(!stack.isEmpty() && Character.isUpperCase(c) && 
               Character.toLowerCase(c) == stack.peek()
              || !stack.isEmpty() && Character.isUpperCase(stack.peek()) &&
               c == Character.toLowerCase(stack.peek())) {
                
                stack.pop();
                
            }
            else
                stack.push(c);
        }
        
        String str = "";
        while(!stack.isEmpty())
            str = stack.pop() + str;
        
        return str;
    }
}