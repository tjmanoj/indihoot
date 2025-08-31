class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        for(int i=s.length() - 1; i >= 0; i--)
        {
            Character c = s.charAt(i);
            if(stack.isEmpty() || !c.equals(stack.peek()))
            {
                stack.push(c);
            }
            else
            {
                stack.pop();
            }
        }

        while(!stack.isEmpty())
        {
            result += stack.pop();
        }

        return result;
    }
}
