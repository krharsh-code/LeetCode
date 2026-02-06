class Solution {
    public boolean isHappy(int n) {
        return solve(n);
    }
    public boolean solve(int n){
        if(n==1) return true;
        if(n==4) return false;

        int sum=0;
        while(n>0){
            int d=n%10;
            sum=sum+d*d;
            n=n/10;
        }
         return solve(sum);
    }
}