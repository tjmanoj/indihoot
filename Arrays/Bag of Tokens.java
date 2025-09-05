class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length == 0 || power == 0) return 0;
        int score = 0;
        Arrays.sort(tokens);
        int left = 0;
        int right = tokens.length - 1;

        while(left <= right)
        {
            // face up
            if(power >= tokens[left])
            {
                power -= tokens[left++];
                score++;
            }
            // face down
            else if(score >=1 && left < right)
            {
                power += tokens[right--];
                score--;
            }
            // cannot play
            else break;
        }
        return score;
    }
}

// TC : O(n log n)
// SC : O(1)
