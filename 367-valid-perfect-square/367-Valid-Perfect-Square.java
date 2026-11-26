class Solution {
    public boolean isPerfectSquare(int n) {
       long l=1,h = n;
       while(l<=h){
        long m =(l+h)/2;
        if(m*m==n) return true;
        if(m*m<n) l=m+1;
        else h=m-1;
       }
       return false;
    }
}