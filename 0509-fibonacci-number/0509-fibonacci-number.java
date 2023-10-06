class Solution {
    public int fib(int n) {
        if(n>1){
            return f(n-1)+f(n-2);
        }
        else if(n==1){
            return 1;
        }
        else{
            return 0;
        }
    }
    public int f(int k){
        int a=0;
        int b=1;
        int fi=0;
        if(k==0){
            return 0;
        }
        else if(k==1){
            return 1;
        }
        else{
            for(int i=2;i<=k;i++){
                fi=a+b;
                a=b;
                b=fi;
            }
            return fi;
        }
    }
}