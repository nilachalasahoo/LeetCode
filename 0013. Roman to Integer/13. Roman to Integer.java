class Solution {
    public int romanToInt(String s) {
        int n=s.length();
        int x=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='I'){
                if(i+1<n && s.charAt(i+1)=='V'){
                    x=x+4;
                    i++;
                }
                else if(i+1<n && s.charAt(i+1)=='X'){
                    x=x+9;
                    i++;
                }
                else
                    x=x+1;
            }else if(c=='V'){
                x=x+5;
            }else if(c=='X'){
                if(i+1<n && s.charAt(i+1)=='L'){
                    x=x+40;
                    i++;
                }
                else if(i+1<n && s.charAt(i+1)=='C'){
                    x=x+90;
                    i++;
                }
                else
                    x=x+10;
            }else if(c=='L'){
                x=x+50;
            }else if(c=='C'){
                if(i+1<n && s.charAt(i+1)=='D'){
                    x=x+400;
                    i++;
                }
                else if(i+1<n && s.charAt(i+1)=='M'){
                    x=x+900;
                    i++;
                }
                else
                    x=x+100;
            }else if(c=='D'){
                x=x+500;
            }else if(c=='M'){
                x=x+1000;
            }
        }
        return x;
    }
}
