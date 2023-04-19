import java.util.HashMap;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                list.add(i);
            }else{
                map.put(i,true);
            }
        }
        return list;
    }
}
