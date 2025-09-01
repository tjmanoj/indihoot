class Solution {
    public boolean isPathCrossing(String path) {
        Set<Pair<Integer, Integer>> hashSet = new HashSet<>();
        int x = 0;
        int y = 0;

        Pair origin = new Pair(0,0);
        hashSet.add(origin);
        for(char c: path.toCharArray())
        {
            if(c == 'N')
            {
                y++;
            }
            else if(c == 'S')
            {
                y--;
            }
            else if(c == 'E')
            {
                x++;
            }
            else
            {
                x--;
            }

            Pair point = new Pair(x,y);
            if(hashSet.contains(point))
            {
                return true;
            }
            hashSet.add(point);
        }
        return false;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)
