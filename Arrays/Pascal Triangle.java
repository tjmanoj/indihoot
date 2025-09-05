class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        if(numRows == 1)
        {
            List<Integer> FirstRow = new ArrayList<>();
            FirstRow.add(1);
            pascalTriangle.add(FirstRow);
            return pascalTriangle;
        }
        
        pascalTriangle= generate(numRows - 1);
        List<Integer> prevRow = pascalTriangle.get(numRows - 2);     // 2 is for 0 based index

        List<Integer> curRow = new ArrayList<>();
        curRow.add(1);

        for(int i=1; i< numRows - 1; i++)
        {
            int value = prevRow.get(i-1) + prevRow.get(i);
            curRow.add(value);
        }
        curRow.add(1);
        pascalTriangle.add(curRow);

        return pascalTriangle;
    }
}

// TC : O(N^2)
// TC : O(N)   for recursive call stack
