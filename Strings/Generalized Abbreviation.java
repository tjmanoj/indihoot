public void helper(String word, String cur, int i, int count, List<String> res) {
        if (i == word.length()) {
            if (count > 0) {
                cur += count; // append leftover count
            }
            res.add(cur);
            return;
        }

        // Choice 1: Abbreviate this character
        helper(word, cur, i + 1, count + 1, res);

        // Choice 2: Keep this character
        String newCur = cur;
        if (count > 0) {
            newCur += count; // flush abbreviation count
        }
        newCur += word.charAt(i);
        helper(word, newCur, i + 1, 0, res);
    }

    public List<String> generateAbbreviations(String word) {
        List<String> res = new ArrayList<>();
        helper(word, "", 0, 0, res);
        return res;
    }

// Time Complexity: O(2^n * n)
// Space Complexity: O(2^n * n)
