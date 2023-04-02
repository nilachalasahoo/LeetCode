import java.util.Arrays;
class Solution {
    public int check(int x,int[] potions,long r){
        int st=0;
        int end=potions.length;
        while(st<end){
            int mid=st+(end-st)/2;
            long ans=1l*x*potions[mid];
            if(ans<r){
                st=mid+1;
            }else{
                end=mid;
            }
        }
        return st;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int arr[]=new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            arr[i]=potions.length-check(spells[i],potions,success);
        }
        return arr;
    }
}
