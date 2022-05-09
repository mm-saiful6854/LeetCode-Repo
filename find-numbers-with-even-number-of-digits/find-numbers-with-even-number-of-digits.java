class Solution {
    public int findNumbers(int[] nums) {
        
        int digitsOfNum;
        int evenNums=0;
        for(double num: nums)
        {
            digitsOfNum = (int)Math.floor(Math.log10(num))+1;
            if(digitsOfNum %2 == 0) evenNums++;
        }
        return evenNums;
    }
}