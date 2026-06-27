class Solution {
    public int maximumLength(int[] nums) {
        Map<Long, Integer> freq = new HashMap<Long, Integer>();
        for(int num: nums){
            //freq.put((long)num, freq.getOrDefault((long)num,0)+1);
            freq.merge((long)num, 1, Integer::sum);
        }

        //check freq of 1
        int freqOfOnes = freq.getOrDefault(1L,0);
        int ans = ((freqOfOnes & 1) ==1)? freqOfOnes : freqOfOnes-1;


        //check other starting values
        freq.remove(1L);
        for(long x : freq.keySet()){
            int length=0;
            while(freq.getOrDefault(x,0)>=2){
                length+=2;
                x*=x;
            }
            ans = Math.max(ans, length + (freq.getOrDefault(x,0) == 1? 1 : -1));
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna