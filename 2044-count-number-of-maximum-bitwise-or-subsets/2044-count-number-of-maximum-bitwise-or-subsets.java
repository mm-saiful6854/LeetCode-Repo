class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxORValue = 0;
        for(int n:nums){
            maxORValue = maxORValue | n;
        }
        HashMap<HashMap<Integer, Integer>, Integer> mem = new HashMap<>();
        int subset = 0;
        for(int i=0;i<nums.length;i++){
            subset+=calculate(nums, i+1, nums[i], maxORValue, mem);
        }
        return subset;
    }
    
    
    public int calculate(int[] nums, int index, int orValue, int target,HashMap<HashMap<Integer, Integer>, Integer> mem  ){
        if(index==nums.length){
            if(orValue==target) return 1;
            else return 0;
        }
        
        HashMap<Integer, Integer> key = new HashMap<>();
        key.put(index, orValue);
        if(mem.get(key)!=null) return mem.get(key);
        
        
        mem.put(key, calculate(nums, index+1,orValue, target,mem) + calculate(nums, index+1, orValue | nums[index], target,mem));
        return mem.get(key);
    }
}