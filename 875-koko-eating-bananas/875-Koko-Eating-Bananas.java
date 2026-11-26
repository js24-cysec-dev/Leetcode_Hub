class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,h1=Arrays.stream(piles).max().getAsInt();
        while(l<h1){
            int m=(l+h1)/2;
            int c=0;
            for(int i:piles){
                c+=Math.ceil(i/(double)m);
            }
            if(c<=h)h1=m;
            else l=m+1;
        }
        return l;
    }
}