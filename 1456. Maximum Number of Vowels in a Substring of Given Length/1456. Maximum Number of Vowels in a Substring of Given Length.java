class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length(),max=0,back=0,front=0;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                front++;
            }
        }
        max=Math.max(max,front);
        for(int i=k;i<n;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                front++;
            }
            if(s.charAt(i-k)=='a' || s.charAt(i-k)=='e' || s.charAt(i-k)=='i' || s.charAt(i-k)=='o' || s.charAt(i-k)=='u'){
                back++;
            }
            max=Math.max(max,front-back);
        }
        if(max>k)
            return k;
        return max;
    }
}
