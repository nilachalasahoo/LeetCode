class LinkedListNode{
    LinkedListNode pre;
    LinkedListNode next;
    String val;
    LinkedListNode(String x){
        val=x;
    }
}
class BrowserHistory {
    LinkedListNode root,head;
    int size,n;
    public BrowserHistory(String homepage) {
        root=new LinkedListNode(homepage);
        head=root;
        size=1;
        n=1;
    }
    
    public void visit(String url) {
        LinkedListNode x=head;
        head.next=new LinkedListNode(url);
        head=head.next;
        head.pre=x;
        n++;
        size=n;
    }
    
    public String back(int steps) {
        while(steps!=0 && head.pre!=null){
            steps--;
            head=head.pre;
            n--;
        }
        return head.val;
    }
    
    public String forward(int steps) {
        while(steps!=0 && head.next!=null){
            steps--;
            head=head.next;
            n++;
        }
        return head.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
