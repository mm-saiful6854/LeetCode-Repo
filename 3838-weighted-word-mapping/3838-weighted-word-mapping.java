class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res = new StringBuilder();
        for(String word : words){
            char[] chars = word.toCharArray();
            int sum =0;
            for(char ch: chars){
                sum +=weights[ch-'a'];
            }
            sum%=26;
            res.append((char)('z'-sum));
        }
        return res.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna