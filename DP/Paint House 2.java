// Optimal
// TC : O(NK)
// SC : O(1)

public int minCostII(int[][] costs) {
        int n = costs.length;
        if(n == 0) return 0;

        int k = costs[0].length;

        int prevMinCost1 = Integer.MAX_VALUE, prevMinCost2 = Integer.MAX_VALUE;
        int prevMinCostInd = -1;

        for(int i=0; i<k; i++)
        {
            if(costs[0][i] < prevMinCost1)
            {
                prevMinCost2 = prevMinCost1;
                prevMinCost1 = costs[0][i];
                prevMinCostInd = i;
            }
            else if(costs[0][i] < prevMinCost2)
            {
                prevMinCost2 = costs[0][i];
            }
        }

        for(int i=1; i<n; i++)
        {
            int curMinCost1 = Integer.MAX_VALUE, curMinCost2 = Integer.MAX_VALUE;
            int curMinCostInd = -1;

            for(int j=0; j<k; j++)
            {
                int minCost;
                if(j != prevMinCostInd)
                {
                    minCost = costs[i][j] + prevMinCost1;
                }
                else 
                {
                    minCost = costs[i][j] + prevMinCost2;
                }

                if(minCost < curMinCost1)
                {
                    curMinCost2 = curMinCost1;
                    curMinCost1 = minCost;
                    curMinCostInd = j;
                }
                else if(minCost < curMinCost2)
                {
                    curMinCost2 = minCost;
                }
            }
            prevMinCost1 = curMinCost1;
            prevMinCost2 = curMinCost2;
            prevMinCostInd = curMinCostInd;
        }  
        return prevMinCost1;
    }








// TC : O(N . K^2)
// SC : O(K)
public int minCostII(int[][] costs) {
        int n = costs.length;
        if(n == 0) return 0;

        int result = Integer.MAX_VALUE;
        int k = costs[0].length;
        int[] minCostList = new int[k];
        for(int i=0;i<k;i++){
             minCostList[i] = costs[0][i];
             if(costs[0][i] < result)
             {
                 result = costs[0][i];
             }
        }

        for(int i=1; i<n; i++)
        {
            int[] temp = new int[k];
            int minTemp = Integer.MAX_VALUE;
            for(int j=0; j<k; j++)
            {
                temp[j] = costs[i][j] + findMin(minCostList, j);
                if(temp[j] < minTemp)
                {
                    minTemp = temp[j];
                }
            }
            for(int ind=0; ind<k;ind++)
            {
                minCostList[ind] = temp[ind];
            }
            result = minTemp;
        }

        return result;
    }

    public int findMin(int[] costs, int ind)
    {
        int min = Integer.MAX_VALUE;
        for(int i=0; i < costs.length; i++)
        {
            if(costs[i] < min && i != ind)
            {
                min = costs[i];
            }
        }
        return min;
    }
