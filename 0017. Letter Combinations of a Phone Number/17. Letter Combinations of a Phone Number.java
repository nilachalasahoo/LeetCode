class Solution {
    public String[] letter(int x){
        if(x=='2')
            return new String[]{"a","b","c"};
        else if(x=='3')
            return new String[]{"d","e","f"};
        else if(x=='4')
            return new String[]{"g","h","i"};
        else if(x=='5')
            return new String[]{"j","k","l"};
        else if(x=='6')
            return new String[]{"m","n","o"};
        else if(x=='7')
            return new String[]{"p","q","r","s"};
        else if(x=='8')
            return new String[]{"t","u","v"};
        else
            return new String[]{"w","x","y","z"};
    }
    public String[] helper(String x){
        if(x.length()==1)
            return letter(x.charAt(0));
        String a[]=helper(x.substring(1));
        String b[]=letter(x.charAt(0));
        int n1=a.length,n2=b.length;
        String arr[]=new String[n1*n2];
        int k=0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                arr[k]=b[j]+a[i];
                k++;
            }
        }
        return arr;
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return new ArrayList<String>();
        List<String> l=Arrays.asList(helper(digits));
        return l;
    }
}
