class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer, Integer> balanceBST = new TreeMap<>();
        for(int n:arr){
            balanceBST.put(n,0);
        }
        int rank=1;
        for(int n:balanceBST.keySet()){
            balanceBST.put(n,rank++);
        }

        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i] = balanceBST.get(arr[i]);
        }
        return res;
    }
}