import java.util.*;
class Solution {
    public int minSetSize(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int c=1;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1])
                c++;
            else{
                list.add(c);
                c=1;
            }
        }
        list.add(c);
        Collections.sort(list);
        int x=list.size();
        c=0;
        while(c<n/2){
            x--;
            c=c+list.get(x);
        }
        return list.size()-x;
    }
}
