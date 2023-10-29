class Solution {
    public int maximumWealth(int[][] accounts) {
        int res=0;
        int temp=0;
        for(int i=0;i<accounts.length;i++){
            temp=0;
            for(int j=0;j<accounts[0].length;j++){
                temp=temp+accounts[i][j];
            }
            if(temp>=res){
                res=temp;
            }
            else{
                continue;
            }
        }
        return res;
    }
}