class Solution {
    public String longestPrefix(String s) {
        String ans="";
        int len1=s.length();
        int[] lps=new int[len1];
        int len=0;
        int i=1;
        while(i<len1){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;   
            }
            else if(len==0){
                lps[i]=0;
                i++;
            }
            else{
                len=lps[len-1];
            }
            ans=s.substring(0,len);
        }
        return ans;
    }
}