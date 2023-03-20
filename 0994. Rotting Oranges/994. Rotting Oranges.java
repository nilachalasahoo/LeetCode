import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int orangesRotting(int[][] grid){
        Queue<int[]> q=new LinkedList<int[]>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    int x[]=new int[2];
                    x[0]=i;
                    x[1]=j;
                    q.add(x);
                }
            }
        }
        q.add(null);
        int t=0;
        while(!q.isEmpty()){
            int arr[]=q.remove();
            if(arr==null){
                if(!q.isEmpty()){
                    t++;
                    q.add(null);
                }
                continue;
            }
            if(arr[0]-1>=0 && grid[arr[0]-1][arr[1]]==1 ){
                grid[arr[0]-1][arr[1]]=2;
                int x[]=new int[2];
                x[0]=arr[0]-1;
                x[1]=arr[1];
                q.add(x);
            }
            if(arr[1]-1>=0 && grid[arr[0]][arr[1]-1]==1){
                grid[arr[0]][arr[1]-1]=2;
                int x[]=new int[2];
                x[0]=arr[0];
                x[1]=arr[1]-1;
                q.add(x);
            }
            if(arr[0]+1<grid.length && grid[arr[0]+1][arr[1]]==1){
                grid[arr[0]+1][arr[1]]=2;
                int x[]=new int[2];
                x[0]=arr[0]+1;
                x[1]=arr[1];
                q.add(x);
            }
            if(arr[1]+1<grid[0].length && grid[arr[0]][arr[1]+1]==1){
                grid[arr[0]][arr[1]+1]=2;
                int x[]=new int[2];
                x[0]=arr[0];
                x[1]=arr[1]+1;
                q.add(x);
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                    return -1;
            }
        }
        return t;
    }
}
