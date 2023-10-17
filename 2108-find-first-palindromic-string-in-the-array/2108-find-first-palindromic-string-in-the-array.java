class Solution {
    public String firstPalindrome(String[] words) {
        String res="";
        for(int i=0;i<words.length;i++){
            int flag=0;
            for(int j=0;j<words[i].length();j++){
                int s=j+1;
                if(words[i].charAt(j)!=words[i].charAt(words[i].length()-s)){
                    flag=1;
                    break;
                }
                else{
                    continue;
                }
            }
            if(flag==0){
                return words[i];
            }
            else{
                continue;
            }
        }
        return res;
    }
}