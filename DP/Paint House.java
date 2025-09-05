public int minCost(int[][] costs) {
        int len = costs.length;
        if(len == 0) return 0;

        int[] costList = {costs[0][0], costs[0][1], costs[0][2]};
        

        for(int i=1; i<len;i++)
        {
            int red = costs[i][0] + Math.min(costList[1], costList[2]);
            int blue = costs[i][1] + Math.min(costList[0], costList[2]);
            int green = costs[i][2] + Math.min(costList[0], costList[1]);

            costList[0] = red;
            costList[1] = blue;
            costList[2] = green;
        }

        return Math.min(Math.min(costList[0],costList[1]),costList[2]);
  }

// TC : O(N)
// TC : O(1)
