class Solution {
    public long countSubarrays(int[] nums, int k) {
        //another approach: two pointer
        int mx =0;
        for(int n:nums) mx = Math.max(mx, n);
        
        int cnt=0,left=0;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==mx) cnt++;
            
            while(cnt==k){
                if(nums[left]==mx) cnt--;
                left++;
            }
            ans+=left;
        }
        return ans;
    }
}