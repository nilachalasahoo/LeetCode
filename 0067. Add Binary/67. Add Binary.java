class Solution {
    public String addBinary(String a, String b) {
        int x=0;
        int n1=a.length()-1,n2=b.length()-1;
        StringBuilder s=new StringBuilder();
        while(n1>=0 || n2>=0){
            if(n1>=0)
                x=x+(a.charAt(n1)-'0');
            if(n2>=0)
                x=x+(b.charAt(n2)-'0');
            s.append(x%2);
            x=x>1?1:0;
            n1--;
            n2--;
        }
        
        if(x==1)
            s=s.append(x);
        return s.reverse().toString();
    }
}
