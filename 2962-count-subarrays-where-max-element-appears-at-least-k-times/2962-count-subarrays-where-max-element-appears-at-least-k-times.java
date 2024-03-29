class Solution {
    public long countSubarrays(int[] nums, int k) {
        //find the max element
        int mx=-1;
        for(int n: nums) mx = Math.max(mx, n);

        //find the mx element and track the index by frequency in map
        int[] freq = new int[nums.length];
        HashMap<Integer,Integer> freqToIndex = new HashMap<>();
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == mx) {
                cnt++;
                freqToIndex.put(cnt, i);
            }
            freq[i]= cnt;
        }
        

        //calculate the subarrays
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(freq[i]>=k){
                int r = freq[i]-(k-1);
                int idx = freqToIndex.getOrDefault(r,-1);
                if(idx>=0){
                    ans+=(idx+1);
                }
            }
        }
        return ans;
    }
}