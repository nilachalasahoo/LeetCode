class Solution {
    public void reverseString(char[] s) {
        int i=0,n=s.length-1;
        while(i<n){
            char temp=s[i];
            s[i]=s[n];
            s[n]=temp;
            i++;n--;
        }
    }
}
