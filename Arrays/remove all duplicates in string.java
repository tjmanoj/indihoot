class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray())
        {
            int len = sb.length();
            if(len == 0 || sb.charAt(len-1) != c)
            {
                sb.append(c);
            }
            else
            {
                sb.deleteCharAt(len-1);
            }
        }
        return sb.toString();
    }
}

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
