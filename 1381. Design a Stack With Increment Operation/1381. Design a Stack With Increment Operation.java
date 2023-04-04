class CustomStack {
    int arr[];
    int n,max;
    public CustomStack(int maxSize) {
        arr=new int[maxSize];
        max=maxSize;
        n=0;
    }
    
    public void push(int x) {
        if(n<max){
            arr[n]=x;
            n++;
        }
    }
    
    public int pop() {
        if(n==0)
            return -1;
        n--;
        return arr[n];
    }
    public void increment(int k, int val) {
        if(n<k){
            for(int i=0;i<n;i++){
                arr[i]=arr[i]+val;
            }
        }else{
            for(int i=0;i<k;i++){
                arr[i]=arr[i]+val;
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
