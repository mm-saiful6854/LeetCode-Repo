class Solution {
    public int[] sortedSquares(int[] nums) {
        
        
        int resultArray[] = new int[nums.length];
        
        int lowPointer =0, highPointer = nums.length-1;
        int resultIndex =nums.length-1;
        while(lowPointer<=highPointer)
        {
            if(Math.abs(nums[lowPointer]) > Math.abs(nums[highPointer])){
                
                resultArray[resultIndex] = nums[lowPointer] * nums[lowPointer];
                lowPointer++;
            }
            else
            {
                resultArray[resultIndex] = nums[highPointer] * nums[highPointer];
                highPointer--;
            }
            resultIndex--;
        }
        
        return resultArray;
    }
}