class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] positionArr = new int[A.length+1];
        
        for(int idx=0;idx<A.length;idx++){
            positionArr[A[idx]] = idx;
        }
        int[] ans = new int[A.length];

        for(int idx=0;idx<B.length;idx++){
            int mx =  Math.max(positionArr[B[idx]], idx);
            ans[mx]++;
            ans[idx] += (idx-1>=0?ans[idx-1]:0);
        }
        return ans;
    }
}