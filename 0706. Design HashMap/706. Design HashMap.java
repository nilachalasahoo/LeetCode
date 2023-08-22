class MyHashMap {
    private class Node{
        Node next;
        int key;
        int value;
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    int size;
    Node[] heads;
    public MyHashMap() {
        size=1000;
        heads=new Node[size];
    }
    private int hash(int key){
        return key%size;
    }
    public void put(int key, int value) {
        Node temp=heads[hash(key)];
        if(temp==null){
            heads[hash(key)]=new Node(key,value);
        }else{
            Node prev=temp;
            while(temp!=null){
                if(temp.key==key){
                    temp.value=value;
                    return;
                }
                prev=temp;
                temp=temp.next;
            }
            prev.next=new Node(key,value);
        }
    }
    
    public int get(int key) {
        Node temp=heads[hash(key)];
        while(temp!=null){
            if(temp.key==key)
                return temp.value;
            temp=temp.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        Node temp=heads[hash(key)];
        if(temp==null)
            return;
        if(temp.key==key){
            heads[hash(key)]=temp.next;
        }
        while(temp.next!=null){
            if(temp.next.key==key){
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
