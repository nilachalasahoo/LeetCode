import java.util.Arrays;
class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n=dist.length;
        for(int i=0;i<n;i++){
            if(dist[i]%speed[i]==0)
                dist[i]=dist[i]/speed[i];
            else
                dist[i]=dist[i]/speed[i]+1;
        }
        Arrays.sort(dist);
        for(int i=0;i<n;i++){
            if(dist[i]-i-1<0)
                return i;
        }
        return n;
    }
}
