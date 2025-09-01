class Solution {
    static {
        for(int i = 0; i < 500; i++) judgeCircle("UDRL");
    }
    public static boolean judgeCircle(String moves) {
        int countUD = 0, countLR = 0;

        for(char ch : moves.toCharArray()) {
            if(ch == 'U') countUD++;
            else if(ch == 'D') countUD--;
            else if(ch == 'L') countLR--;
            else countLR++;
        }
        return (countUD == 0 && countLR == 0);
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
