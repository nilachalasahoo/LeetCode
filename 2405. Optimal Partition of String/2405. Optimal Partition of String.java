import java.util.Arrays;
class Solution {
    public int partitionString(String s) {
        boolean []hash = new boolean[26];
        Arrays.fill(hash,false);

        int i = 0,ans = 1;
        while(i<s.length()){
            int n = s.charAt(i)-'a';
            if(hash[n]==true){
                Arrays.fill(hash,false);
                ans++;
            }
            hash[n] = true;
            i++;
        }
        return ans;
    }
}
