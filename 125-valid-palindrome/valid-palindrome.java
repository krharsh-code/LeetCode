class Solution {
    public boolean isPalindrome(String s) {
      s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
      return check(s,0,s.length()-1);  
    }
    public boolean check(String s, int l, int r){
        // base case
        if(l>=r) return true;

        if(s.charAt(l)!=s.charAt(r)){
            return false;
        }

        return check(s,l+1,r-1);
    }
}