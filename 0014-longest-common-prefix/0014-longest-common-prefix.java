class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len=strs.length;
        if(len==0) return "";
        int min=strs[0].length();
        for(int i=0;i<len;i++){
            if(strs[i].length()<min){
                min=strs[i].length();
            }
        }
        // f
        for(int i=0;i<min;i++){
            char c=strs[0].charAt(i);
            for(int j=0;j<len;j++){
                if(strs[j].charAt(i)!=c){
                    return strs[0].substring(0,i);
                }
            }
        }
return strs[0].substring(0,min);
    }
}
        
         
