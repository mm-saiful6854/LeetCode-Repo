class Solution {
    int n;
    int m;
    int[] dx = new int[]{0,0,1,-1};
    int[] dy = new int[]{1,-1,0,0};
    Queue<Position> queue = new LinkedList<>();
    public int[][] highestPeak(int[][] isWater) {
        n = isWater.length;
        m = isWater[0].length;
        int[][] result = new int[isWater.length][isWater[0].length];
        for(int i=0;i<n;i++)
            Arrays.fill(result[i],1000000);
        for(int x = 0;x<n;x++){
            for(int y = 0;y<m;y++){
                if(isWater[x][y] == 1){
                    result[x][y] = 0;
                    queue.add(new Position(x,y));
                }
                else {
                    result[x][y]=-1;
                }
            }
        }
        bfs(queue,result);
        return result;
    }

    public void bfs(Queue<Position> queue, int[][] result){
        while(!queue.isEmpty()){
            Position current = queue.remove();
            for(int i=0;i<4;i++){
                int x = current.x + dx[i];
                int y = current.y + dy[i];
                if(x>=0 && y>=0 && x<n && y<m && result[x][y]<0){
                    result[x][y] = result[current.x][current.y]+1;
                    queue.add(new Position(x,y));
                }
            }
        }
    }

    public static class Position {
        int x;
        int y;
        public Position(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}