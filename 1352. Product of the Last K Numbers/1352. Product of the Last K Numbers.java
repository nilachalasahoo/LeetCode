import java.util.ArrayList;
class ProductOfNumbers {
    ArrayList<Integer> list;
    int ans;
    public ProductOfNumbers() {
        list=new ArrayList<>();
        ans=1;
    }
    
    public void add(int num) {
        if(num==0){
            list.clear();
            ans=1;
        }else{
            ans=ans*num;
            list.add(ans);
        }
    }
    
    public int getProduct(int k) {
        k=list.size()-k;
        if(k==0)
            return ans;
        else if(k>0)
            return ans/list.get(k-1);
        return 0;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
