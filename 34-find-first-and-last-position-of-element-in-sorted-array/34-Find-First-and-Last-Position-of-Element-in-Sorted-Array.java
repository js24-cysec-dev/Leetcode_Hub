class Solution {
    int lowerbound(int []nums,int target){
        int l=0,h=nums.length;
        while(l<h){
            int m=(l+h)/2;
            if(nums[m]>=target)h=m;
            else l=m+1;
        }
        return l;
    }

      int upperbound(int []nums,int target){
        int l=0,h=nums.length;
        while(l<h){
            int m=(l+h)/2;
            if(nums[m]>target)h=m;
            else l=m+1;
        }
        return l;
    }



    public int[] searchRange(int[] nums, int target) {
        int lb = lowerbound(nums,target);
        if(lb == nums.length||nums[lb]!=target){
            return new int[]{-1,-1};
        }
        int ub =upperbound(nums,target);
        return new int[]{lb,ub-1};
    }
}