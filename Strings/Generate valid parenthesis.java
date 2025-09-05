  public void helper(List<String> res,String  cur,int open, int close, int n)
    {
        if(n == open && n == close)
        {
            res.add(cur);
            return;
        }

        if(open < n)
        {
            helper(res, cur + "(", open+1, close, n);
        }
        if(open > close)
        {
            helper(res, cur + ")", open, close+1,n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(res, "", 0, 0, n);
        return res;
    }

// Time complexity:
// There are C_n (n-th Catalan number) valid combinations.
// Each string has length 2n, so total complexity is O(4^n / √n) (Catalan number growth).
// Space complexity:
// Recursion depth: O(n)
// Result storage: O(C_n * 2n)
