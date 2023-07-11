import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char x=s.charAt(i);
            if(x=='(' || x=='{' || x=='[')
                st.push(x);
            else if(!st.isEmpty() && x==')' && st.peek()=='(')
                st.pop();
            else if(!st.isEmpty() && x=='}' && st.peek()=='{')
                st.pop();
            else if(!st.isEmpty() && x==']' && st.peek()=='[')
                st.pop();
            else
                return false;
        }
        if(st.isEmpty())
            return true;
        return false;
    }
}
