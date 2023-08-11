import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int x=strs.length;
        Arrays.sort(strs);
        int n1=strs[0].length(),n2=strs[x-1].length();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<Math.min(n1,n2);i++){
            char c=strs[0].charAt(i);
            if(c!=strs[x-1].charAt(i))
                return s.toString();
            s.append(c);
        }
        return s.toString();
    }
}
