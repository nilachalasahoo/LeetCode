class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        st.push(asteroids[0]);
        for(int i=1;i<asteroids.length;i++){
            if(asteroids[i]>0)
                st.push(asteroids[i]);
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()>0 && st.peek()< -asteroids[i]){
                    st.pop();
                }
                if(st.size()==0 || st.peek()<0){
                    st.push(asteroids[i]);
                }
                if(st.peek()+asteroids[i]==0){
                    st.pop();
                }
            }
        }
        asteroids=new int[st.size()];
        for(int i=asteroids.length-1;i>=0;i--){
            asteroids[i]=st.pop();
        }
        return asteroids;
    }
}
