class Solution {
    public int findComplement(int num) {
        long num_cp = (long) num;
        int bit_cnt=0;
        while(num>0)
        {
            bit_cnt++;
            num/=2;
        }
        //System.out.printf("bit: %d ", bit_cnt);
        //System.out.printf("bit: %d ", (long)Math.pow(2,bit_cnt));
        return (int)((long) Math.pow(2,bit_cnt) - 1L - num_cp);
        
    }
}