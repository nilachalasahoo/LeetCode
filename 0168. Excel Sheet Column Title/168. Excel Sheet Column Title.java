class Solution {
    public String convertToTitle(int n) {
        StringBuilder s=new StringBuilder();
        while(n>0){
            int x=(n-1)%26;
            s.insert(0,(char)('A'+x));
            n=(n-1)/26;
        }
        return s.toString();
    }
}
