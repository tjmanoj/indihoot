class Solution {
    public int compress(char[] chars) {
        int readInd = 0;
        int writeInd = 0;

        while(readInd < chars.length)
        {
            int count = 0;
            char curChar = chars[readInd];
            while(readInd < chars.length && chars[readInd] == curChar)
            {
                readInd++;
                count++;
            }
            chars[writeInd++] = curChar;

            if(count > 1)
            {
                for(char c: Integer.toString(count).toCharArray())
                {
                    chars[writeInd++] = c;
                }
            }
        }
        return writeInd;
    }
}

// Time Complexity: O(n)
