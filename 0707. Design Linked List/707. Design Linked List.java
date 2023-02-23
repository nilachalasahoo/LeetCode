
class MyLinkedList {
    class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
    Node head;
    int size;
    public MyLinkedList() {
        size=0;
        head=null;
    }
    
    public int get(int index) {
        if(index>=size)
            return -1;
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    
    public void addAtHead(int val) {
            Node temp=head;
            head=new Node(val);
            head.next=temp;
            size++;
    }
    
    public void addAtTail(int val) {
        if(head==null){
            head=new Node(val);
            size++;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Node(val);
            size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size){
            return;
        }
        if(index==0){
                Node temp=head;
                head=new Node(val);
                head.next=temp;
                size++;
                return;
        }
        if(index==size){
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Node(val);
            size++;
            return;
        }
        index=index-1;
        Node temp=head;
        while(index!=0){
            temp=temp.next;
            index--;
        }
        Node x=new Node(val);
        x.next=temp.next;
        temp.next=x;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size)
            return;
        if(index==0){
            head=head.next;
            size--;
        }
        else{
            index=index-1;
            Node temp=head;
            while(index!=0){
                temp=temp.next;
                index--;
            }
            temp.next=temp.next.next;
            size--;
        }
        
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
