class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=1;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==1){
                n=n-((c-1)/2);
                c=0;
            }else
                c++;
        }
        if(flowerbed[flowerbed.length-1]==0)
            n=n-c/2;
        if(n>0)
            return false;
        return true;
    }
}
