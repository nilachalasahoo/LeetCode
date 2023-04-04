import java.util.Stack;
class Solution {
    public String decodeString(String s) {
        Stack<Integer> st1=new Stack<>();
        Stack<String> st2=new Stack<>();
        String res="";
        int n=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                n=n*10+ch-'0';
            }else if(ch=='['){
                st1.push(n);
                st2.push(res);
                n=0;
                res="";
            }else if(ch==']'){
                n=st1.pop();
                String a=res;
                res=st2.pop();
                res=res+a.repeat(n);
                n=0;
            }else{
                res=res+ch;
            }
        }
        return res;
    }
}
