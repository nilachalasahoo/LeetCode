import java.util.Queue;
import java.util.LinkedList;
class MyStack {
    Queue<Integer> q1,q2;
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        if(q1.isEmpty())
            return -1;
        q2=q1;
        q1=new LinkedList<>();
        while(q2.size()!=1){
            q1.add(q2.poll());
        }
        return q2.poll();
    }
    
    public int top() {
        if(q1.isEmpty())
            return -1;
        q2=q1;
        q1=new LinkedList<>();
        while(q2.size()!=1){
            q1.add(q2.poll());
        }
        int x=q2.poll();
        q1.add(x);
        return x;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
