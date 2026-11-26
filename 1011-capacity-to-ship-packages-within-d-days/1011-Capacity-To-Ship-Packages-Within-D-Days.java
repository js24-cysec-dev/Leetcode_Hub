class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int s=0;
        for(int i=0;i<weights.length;i++){
            s+=weights[i];
        }
        long l=1,h=s;
        while(l<h){
            long m=(l+h)/2;
            long d=0,c=1;
            for(int i:weights){
                if(i>m){c=days+1;break;}
                if(d+i<=m)d+=i;
                else {c++;d=i;}
            }
            if(c<=days)h=m;
            else l=m+1;
        }
        return (int)l;
       
    }
}