class Solution {
    public int splitNum(int num) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(num!=0){
            arr.add(num%10);
            num/=10;
        }
        Collections.sort(arr);
        int n1=0,n2=0;
        for(int i=0;i<arr.size();i++){
            n1=n1*10+arr.get(i);
            i++;
            if(i<arr.size())
                n2=n2*10+arr.get(i);
        }
        return n1+n2;
    }
}
