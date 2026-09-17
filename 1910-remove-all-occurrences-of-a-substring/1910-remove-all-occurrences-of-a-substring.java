class Solution {
    public String removeOccurrences(String s, String part) {
        int n=s.length();
        int m=part.length();
        int[] lps=new int[m];
        int len=0; int i=1;
        while(i<m){
            if(part.charAt(i)==part.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else if(len>0){
                len=lps[len-1];
            }
            else{
                lps[i]=0;
                i++;
            }

        }
        StringBuilder sb=new StringBuilder();
        int[] match=new int[n];
        int j=0;
        for(char ch:s.toCharArray()){
            while(j>0 && ch!=part.charAt(j)){
                j=lps[j-1];
            }
            if(ch==part.charAt(j)){
                j++;
            }
            sb.append(ch);
            match[sb.length()-1]=j;
            if(j==m){
                sb.delete(sb.length()-m,sb.length());
                if(sb.length()==0){
                    j=0;
                }
                else{
                    j=match[sb.length()-1];
                }
            }
        }
        return sb.toString();
    }
}