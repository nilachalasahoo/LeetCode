class Solution {
    public int compress(char[] chars) {
        int c=1;
        if(chars.length==0)
            return 0;
        ArrayList<Character> list=new ArrayList<Character>(); 
        list.add(chars[0]);
        for(int i=1;i<chars.length;i++){
            if(chars[i-1]==chars[i])
                c++;
            else{
                if(c==1)
                    list.add(chars[i]);
                else{
                    for(int j=0;j<Integer.toString(c).length();j++){
                        list.add(Integer.toString(c).charAt(j));
                    }
                    list.add(chars[i]);
                }
                c=1;
            }
        }
        if(c>1){
            for(int j=0;j<Integer.toString(c).length();j++){
                list.add(Integer.toString(c).charAt(j));
            }
        }
        for(int i=0;i<list.size();i++){
            chars[i]=list.get(i);
        }
        return list.size();
    }
}
