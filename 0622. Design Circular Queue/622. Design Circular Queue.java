import java.util.LinkedList;
class MyCircularQueue {
    int i,n,x=0;
    int arr[];
    public MyCircularQueue(int k) {
        arr=new int[1000];
        n=k;
        i=0;
    }
    
    public boolean enQueue(int value) {
        if(x<n){
            arr[x]=value;
            x++;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(x!=i){
            n++;
            i++;
            return true;
        }
        return false;
    }
    
    public int Front() {
        if(x==i)
            return -1;
        return arr[i];
    }
    
    public int Rear() {
        if(x==i)
            return -1;
        return arr[x-1];
    }
    
    public boolean isEmpty() {
        return x==i;
    }
    
    public boolean isFull() {
        return x==n;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
