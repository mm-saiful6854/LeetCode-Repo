class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxORValue = 0;
        for(int n:nums){
            maxORValue = maxORValue | n;
        }
        
        int subset = 0;
        for(int i=0;i<nums.length;i++){
            subset+=calculate(nums, i+1, nums[i], maxORValue);
        }
        return subset;
    }
    
    
    public int calculate(int[] nums, int index, int orValue, int target){
        if(index==nums.length){
            if(orValue==target) return 1;
            else return 0;
        }

        return calculate(nums, index+1,orValue, target) + calculate(nums, index+1, orValue | nums[index], target);
    }
}