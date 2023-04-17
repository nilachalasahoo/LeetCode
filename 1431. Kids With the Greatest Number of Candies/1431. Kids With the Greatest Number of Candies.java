class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            list.add(candies[i]+extraCandies >= max);
        }
        return list;
    }
}
