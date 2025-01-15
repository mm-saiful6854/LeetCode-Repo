class Solution {
    public int minimizeXor(int num1, int num2) {
        int setBit1=0, setBit2 =0;
        int tNum1 = num1, tNum2 = num2;
        while(tNum1 >0 || tNum2>0){
            setBit1 +=(tNum1 & 1);
            setBit2 +=(tNum2 & 1);
            tNum1/=2;
            tNum2/=2;
        }

        tNum1 = num1;
        int x =0;
        int diff = setBit1 - setBit2;
        if(diff==0) return num1;
        else if(diff > 0){
            int cnt = 0;
            while(diff>0){
                if((tNum1 & 1)==1){
                    x +=(int)Math.pow(2,cnt);
                    diff--;
                }
                tNum1/=2;
                cnt++;
            }
        } 
        else {
            int cnt = 0;
            diff = (-1)*diff;
            while(diff>0){
                if((tNum1 & 1)==0){
                    x +=(int)Math.pow(2,cnt);
                    diff--;
                }
                tNum1/=2;
                cnt++;
            }
        }
        return num1 ^ x;

    }
}