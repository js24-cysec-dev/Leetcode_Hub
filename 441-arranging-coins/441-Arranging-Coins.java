class Solution {
    public int arrangeCoins(int n) {
        long l=1,h=n/2+1;
        while(l<h){
            long m =(long) Math.ceil((l+h)/2.0);
            if(m*(m+1)/2<=n)l=m;
            else h=m-1;
        }
        return (int) l;
    }
}