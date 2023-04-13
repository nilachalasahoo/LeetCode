import java.util.Stack;
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int j=0;
        for(int i=0;i<pushed.length;i++){
            if(pushed[i]==popped[j]){
                j++;
                while(!st.isEmpty() && st.peek()==popped[j]){
                    j++;
                    st.pop();
                }
            }else{
                st.push(pushed[i]);
            }
        }
        while(!st.isEmpty()){
            if(popped[j]!=st.pop()){
                return false;
            }
            j++;
        }
        return true;
    }
}
