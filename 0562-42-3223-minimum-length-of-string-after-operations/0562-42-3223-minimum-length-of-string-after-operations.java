class Solution {
    int[] frequency = new int[26];
    public int minimumLength(String s) {
        char[] charArr = s.toCharArray();
        for(char ch: charArr){
            frequency[ch -'a']++;
        }

        int answer = 0;
        for(int i=0;i<=25;i++){
            while(frequency[i]>=3){
                frequency[i] = ((frequency[i]/3)+(frequency[i]%3));
            }
            answer += frequency[i];
        }
        return answer;
    }
}