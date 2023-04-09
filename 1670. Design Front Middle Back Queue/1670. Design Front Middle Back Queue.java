class FrontMiddleBackQueue {
    LinkedList<Integer> head;
    int n;
    public FrontMiddleBackQueue() {
        head=new LinkedList<>();
        n=0;
    }
    
    public void pushFront(int val) {
        head.add(0,val);
        n++;
    }
    
    public void pushMiddle(int val) {
        head.add(n/2,val);
        n++;
    }
    
    public void pushBack(int val) {
        head.add(n,val);
        n++;
    }
    
    public int popFront() {
        if(n==0)
            return -1;
        n--;
        return head.remove(0);
    }
    
    public int popMiddle() {
        if(n==0)
            return -1;
        n--;
        return head.remove(n/2);
    }
    
    public int popBack() {
        if(n==0)
            return -1;
        n--;
        return head.remove(n);
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */
